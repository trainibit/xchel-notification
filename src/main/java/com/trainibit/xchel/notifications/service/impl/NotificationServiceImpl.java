package com.trainibit.xchel.notifications.service.impl;

import com.trainibit.xchel.notifications.entity.Notification;
import com.trainibit.xchel.notifications.request.NotificationRequest;
import com.trainibit.xchel.notifications.response.NotificationResponse;
import com.trainibit.xchel.notifications.service.NotificationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NotificationServiceImpl implements NotificationService {


    @Override
    public List<NotificationResponse> findAllNotification() {
        return List.of();
    }

    @Override
    public NotificationResponse findNotificationByUuid(UUID uuid) {
        return null;
    }

    @Override
    public NotificationResponse saveNotification(NotificationRequest NotificationRequest) {
        return null;
    }


    @Override
    public void deleteNotificationByUuid(UUID uuid) {

    }

    @Override
    public void updateNotificationByUuid(UUID uuid) {

    }
}
