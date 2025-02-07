package com.trainibit.xchel.notifications.repository;

import com.trainibit.xchel.notifications.entity.NotificationTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface NotificationTemplateRepository extends JpaRepository<NotificationTemplate, Long> {

    //Obtener todas las notificaciones
    List<NotificationTemplate> findAll();

    //Obtener notificaciones por uuid
    NotificationTemplate findByUuid(UUID uuid);

}