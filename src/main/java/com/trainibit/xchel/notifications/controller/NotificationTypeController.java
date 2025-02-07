package com.trainibit.xchel.notifications.controller;

import com.trainibit.xchel.notifications.response.NotificationTemplateResponse;
import com.trainibit.xchel.notifications.response.NotificationTypeResponse;
import com.trainibit.xchel.notifications.service.NotificationTemplateService;
import com.trainibit.xchel.notifications.service.NotificationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notifications-types")
public class NotificationTypeController {

//    @Autowired
//    private NotificationTypeService notificationTypeService;
//
//    //Obtener toda slas notificaciones
//    @GetMapping
//    public ResponseEntity<List<NotificationTypeResponse>> getNotificationsType() {
//        return ResponseEntity.ok(notificationTypeService.findAllNotificationType());
//    }
}
