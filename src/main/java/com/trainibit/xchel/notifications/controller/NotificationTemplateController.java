package com.trainibit.xchel.notifications.controller;

import com.trainibit.xchel.notifications.response.NotificationTemplateResponse;
import com.trainibit.xchel.notifications.service.NotificationTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notifications-templates")
public class NotificationTemplateController {

//    @Autowired
//    private NotificationTemplateService notificationTemplateService;
//
//    //Obtener toda slas notificaciones
//    @GetMapping
//    public ResponseEntity<List<NotificationTemplateResponse>> getNotificationsTemplate() {
//        return ResponseEntity.ok(notificationTemplateService.findAllNotificationTemplate());
//    }

//
//    //Obtener notificaciones por uuid
//    @GetMapping("/{uuid}")
//    public ResponseEntity<NotificationTemplate> getById(@PathVariable UUID uuid) {
//        Notifi notificationResponse = notificationTemplateService.findNotificationTemplateByUuid(uuid);
//        if (notificationResponse != null) {
//            return ResponseEntity.ok(notificationResponse);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    //Agregar notificaciones
//    @PostMapping
//    public ResponseEntity<NotificationResponse> saveNotification(@Valid @RequestBody NotificationRequest notificationRequest) {
//        NotificationResponse newNotification = notificationTemplateService.saveNotification(notificationRequest);
//
//        return ResponseEntity.ok(newNotification);
//    }
//
//    //Eliminar notificaciones por uuid
//    @DeleteMapping("/{uuid}")
//    public ResponseEntity<Void> deleteNotification(@PathVariable UUID uuid){
//        notificationTemplateService.deleteNotificationByUuid(uuid);
//        return ResponseEntity.noContent().build();
//    }
//
//    //Actualizar notificaciones por uuid
//    @PutMapping("/{uuid}")
//    public ResponseEntity<NotificationResponse> updateNotification(@PathVariable UUID uuid, @RequestBody NotificationRequest notificationRequest) {
//        NotificationResponse updatedNotification = notificationTemplateService.updateNotificationByUuid(uuid, notificationRequest);
//        if (updatedNotification != null) {
//            return ResponseEntity.ok(updatedNotification);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }


}
