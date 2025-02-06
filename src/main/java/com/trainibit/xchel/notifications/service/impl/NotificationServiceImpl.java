package com.trainibit.xchel.notifications.service.impl;

import com.trainibit.xchel.notifications.entity.Notification;
import com.trainibit.xchel.notifications.mapper.NotificationMapper;
import com.trainibit.xchel.notifications.repository.NotificationRepository;
import com.trainibit.xchel.notifications.request.NotificationRequest;
import com.trainibit.xchel.notifications.response.NotificationResponse;
import com.trainibit.xchel.notifications.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private NotificationMapper notificationMapper;

    @Override
    public List<NotificationResponse> findAllNotification() {
        List<Notification> notificationList = notificationRepository.findAll();
        return notificationList.stream().map(notificationMapper::mapEntityToDto).collect(Collectors.toList());
    }


    @Override
    public NotificationResponse findNotificationByUuid(UUID uuid) {
        Notification notification = notificationRepository.findNotificationByUuid(uuid);
        return notificationMapper.mapEntityToDto(notification);
    }

    @Override
    public NotificationResponse saveNotification(NotificationRequest NotificationRequest) {
        Notification notification = notificationMapper.mapDtoToEntity(NotificationRequest);
        Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());

        notification.setUuid(UUID.randomUUID());
        notification.setUserUuid(NotificationRequest.getUserUuid());
        notification.setSendDate(new Timestamp(NotificationRequest.getSendDate().getTime()));
        notification.setNotificationTemplate(NotificationRequest.getNotificationTemplate());
        notification.setStatus("CREATED");
        notification.setCreatedAt(currentTimeStamp);
        notification.setUpdatedAt(currentTimeStamp);
        notification.setActive(true);

       Notification saveNotification = notificationRepository.save(notification);

        return notificationMapper.mapEntityToDto(saveNotification);
    }


    @Override
    public void deleteNotificationByUuid(UUID uuid) {
        notificationRepository.delete(notificationRepository.deleteNotificationByUuid(uuid));
    }

    @Override
    public NotificationResponse updateNotificationByUuid(UUID uuid, NotificationRequest notificationRequest) {

        Notification existingNotification = notificationRepository.findNotificationByUuid(uuid);

        existingNotification.setUserUuid(notificationRequest.getUserUuid());
        existingNotification.setSendDate(new Timestamp(notificationRequest.getSendDate().getTime()));
        existingNotification.setNotificationTemplate(notificationRequest.getNotificationTemplate());
        existingNotification.setStatus(notificationRequest.getStatus());
        existingNotification.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        existingNotification.setActive(notificationRequest.getActive());

        return notificationMapper.mapEntityToDto(notificationRepository.save(existingNotification));
    }

}
