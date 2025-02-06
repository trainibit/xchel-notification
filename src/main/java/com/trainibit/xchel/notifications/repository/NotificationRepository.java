package com.trainibit.xchel.notifications.repository;


import com.trainibit.xchel.notifications.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    //Obtener todas las notificaciones
    List<Notification> findAllNotification();

    //Obtener notificaciones por uuid
    Notification findNotificationByUuid(UUID uuid);

    //Eliminar notificaciones por uuid
    Notification deleteNotificationByUuid(UUID uuid);

    //Actualizar notificaciones por uuid
    void updateNotificationByUuid(UUID uuid);


}
