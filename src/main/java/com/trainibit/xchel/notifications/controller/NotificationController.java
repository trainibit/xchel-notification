package com.trainibit.xchel.notifications.controller;

import com.trainibit.xchel.notifications.request.NotificationRequest;
import com.trainibit.xchel.notifications.response.NotificationResponse;
import com.trainibit.xchel.notifications.service.NotificationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    //Obtener toda slas notificaciones
    @GetMapping
    public ResponseEntity<List<NotificationResponse>> getNotifications() {
        return ResponseEntity.ok(notificationService.findAllNotification());
    }

    //Obtener notificaciones por uuid
    @GetMapping("/{uuid}")
    public ResponseEntity<NotificationResponse> getById(@PathVariable UUID uuid) {
        NotificationResponse notificationResponse = notificationService.findNotificationByUuid(uuid);
        if (notificationResponse != null) {
            return ResponseEntity.ok(notificationResponse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //Agregar notificaciones
    @PostMapping
    public ResponseEntity<NotificationResponse> saveNotification(@Valid @RequestBody NotificationRequest notificationRequest) {
        NotificationResponse newNotification = notificationService.saveNotification(notificationRequest);

        return ResponseEntity.ok(newNotification);
    }

    //Eliminar notificaciones por uuid
    @DeleteMapping("/{uuid}")
    public ResponseEntity<Void> deleteNotification(@PathVariable UUID uuid){
        notificationService.deleteNotificationByUuid(uuid);
        return ResponseEntity.noContent().build();
    }

    //Actualizar notificaciones por uuid
    @PutMapping("/{uuid}")
    public ResponseEntity<NotificationResponse> updateNotification(@PathVariable UUID uuid, @RequestBody NotificationRequest notificationRequest) {
        NotificationResponse updatedNotification = notificationService.updateNotificationByUuid(uuid, notificationRequest);
        if (updatedNotification != null) {
            return ResponseEntity.ok(updatedNotification);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
