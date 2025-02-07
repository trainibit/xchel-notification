package com.trainibit.xchel.notifications.service;

import com.trainibit.xchel.notifications.entity.Notification;
import com.trainibit.xchel.notifications.request.NotificationRequest;
import com.trainibit.xchel.notifications.response.NotificationResponse;

import java.util.List;
import java.util.UUID;

public interface NotificationService {

    //Obtener todas las notificaciones
    List<NotificationResponse> findAllNotification();

    //Obtener notificaciones por uuid
    Notification findNotificationByUuid(UUID uuid);

    //Agregar notificaciones
    NotificationResponse saveNotification(NotificationRequest NotificationRequest);

    //Eliminar notificaciones por uuid
    void deleteNotificationByUuid(UUID uuid);

    //Actualizar notificaciones por uuid
    NotificationResponse updateNotificationByUuid(UUID uuid, NotificationRequest notificationRequest);

}
