package com.trainibit.xchel.notifications.repository;

import com.trainibit.xchel.notifications.entity.NotificationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface NotificationTypeRepository extends JpaRepository<NotificationType, Long> {
    //Obtener todas las notificaciones
    List<NotificationType> findAll();

    //Obtener notificaciones por uuid
    NotificationType findByUuid(UUID uuid);

}
