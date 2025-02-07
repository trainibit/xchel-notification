package com.trainibit.xchel.notifications.service.impl;

import com.trainibit.xchel.notifications.entity.Notification;
import com.trainibit.xchel.notifications.entity.NotificationTemplate;
import com.trainibit.xchel.notifications.mapper.NotificationMapper;
import com.trainibit.xchel.notifications.repository.NotificationRepository;
import com.trainibit.xchel.notifications.repository.NotificationTemplateRepository;
import com.trainibit.xchel.notifications.request.NotificationRequest;
import com.trainibit.xchel.notifications.response.NotificationResponse;
import com.trainibit.xchel.notifications.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private NotificationMapper notificationMapper;

    @Autowired
    private NotificationTemplateRepository notificationTemplateRepository;

    @Override
    public List<NotificationResponse> findAllNotification() {
        List<Notification> notificationList = notificationRepository.findAll();
        return notificationMapper.mapEntityToDtoList(notificationList);
    }


    @Override
    public Notification findNotificationByUuid(UUID uuid) {
        Notification notification = notificationRepository.findByUuid(uuid);
        return notification;
    }

    @Override
    public NotificationResponse saveNotification(NotificationRequest notificationRequest) {


        Notification notification = notificationMapper.requestToEntity(notificationRequest);
        NotificationTemplate notificationTemplateTemporary = notificationTemplateRepository.findByUuid(notificationRequest.getNotificationTemplateUuid());
        notification.setNotificationTemplate(notificationTemplateTemporary);

        Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());

        notification.setUuid(UUID.randomUUID());
        notification.setSendDate(currentTimeStamp);

        notification.setCreatedAt(currentTimeStamp);
        notification.setUpdatedAt(currentTimeStamp);
        notification.setActive(true);

        Notification saveNotification = notificationRepository.save(notification);

        return notificationMapper.mapEntityToDto(saveNotification);
    }


    @Override
    public void deleteNotificationByUuid(UUID uuid) {
        notificationRepository.delete(notificationRepository.findByUuid(uuid));
    }

    @Override
    public NotificationResponse updateNotificationByUuid(UUID uuid, NotificationRequest notificationRequest) {

        Notification existingNotification = notificationRepository.findByUuid(uuid);

        NotificationTemplate notificationTemplateTemporary = notificationTemplateRepository.findByUuid(notificationRequest.getNotificationTemplateUuid());

        Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());

        existingNotification.setUserUuid(notificationRequest.getUserUuid());
        existingNotification.setNotificationTemplate(notificationTemplateTemporary);
        existingNotification.setStatus(notificationRequest.getStatus());
        existingNotification.setUpdatedAt(currentTimeStamp);
        existingNotification.setActive(notificationRequest.getActive());

        return notificationMapper.mapEntityToDto(notificationRepository.save(existingNotification));
    }

}
