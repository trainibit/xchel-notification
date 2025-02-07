package com.trainibit.xchel.notifications.service.impl;

import com.trainibit.xchel.notifications.entity.NotificationTemplate;
import com.trainibit.xchel.notifications.mapper.NotificationTemplateMapper;
import com.trainibit.xchel.notifications.repository.NotificationTemplateRepository;
import com.trainibit.xchel.notifications.request.NotificationTemplateRequest;
import com.trainibit.xchel.notifications.response.NotificationTemplateResponse;
import com.trainibit.xchel.notifications.service.NotificationTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NotificationTemplateServiceImpl implements NotificationTemplateService {

//    @Autowired
//    private NotificationTemplateRepository notificationTemplateRepository;
//
//    @Autowired
//    private NotificationTemplateMapper notificationTemplateMapper;
//
//    @Override
//    public List<NotificationTemplateResponse> findAllNotificationTemplate() {
//        List<NotificationTemplate> notificationTemplateList = notificationTemplateRepository.findAll();
//        return notificationTemplateMapper.mapEntityToDtoList(notificationTemplateList);
//    }
//
//    @Override
//    public NotificationTemplate findNotificationTemplateByUuid(UUID uuid) {
//        return null;
//    }
//
//    @Override
//    public NotificationTemplateResponse saveNotificationTemplate(NotificationTemplateRequest notificationTemplateRequest) {
//        return null;
//    }
//
//    @Override
//    public void deleteNotificationTemplateByUuid(UUID uuid) {
//
//    }
//
//    @Override
//    public NotificationTemplateResponse updateNotificationTemplateByUuid(UUID uuid, NotificationTemplateRequest notificationTemplateRequest) {
//        return null;
//    }
}
