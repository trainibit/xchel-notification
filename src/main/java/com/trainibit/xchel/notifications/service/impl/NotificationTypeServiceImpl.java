package com.trainibit.xchel.notifications.service.impl;

import com.trainibit.xchel.notifications.entity.NotificationTemplate;
import com.trainibit.xchel.notifications.entity.NotificationType;
import com.trainibit.xchel.notifications.mapper.NotificationTemplateMapper;
import com.trainibit.xchel.notifications.mapper.NotificationTypeMapper;
import com.trainibit.xchel.notifications.repository.NotificationTemplateRepository;
import com.trainibit.xchel.notifications.repository.NotificationTypeRepository;
import com.trainibit.xchel.notifications.request.NotificationTypeRequest;
import com.trainibit.xchel.notifications.response.NotificationTypeResponse;
import com.trainibit.xchel.notifications.service.NotificationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NotificationTypeServiceImpl implements NotificationTypeService {

//
//    @Autowired
//    private NotificationTypeRepository notificationTypeRepository;
//
//    @Autowired
//    private NotificationTypeMapper notificationTypeMapper;
//
//    @Override
//    public List<NotificationTypeResponse> findAllNotificationType() {
//        List<NotificationType> notificationTypeList = notificationTypeRepository.findAll();
//        return notificationTypeMapper.mapEntityToDtoList(notificationTypeList);
//    }
//
//    @Override
//    public NotificationType findNotificationTypeByUuid(UUID uuid) {
//        return null;
//    }
//
//    @Override
//    public NotificationTypeResponse saveNotificationType(NotificationTypeRequest notificationTypeRequest) {
//        return null;
//    }
//
//    @Override
//    public void deleteNotificationTypeByUuid(UUID uuid) {
//
//    }
//
//    @Override
//    public NotificationTypeResponse updateNotificationTypeByUuid(UUID uuid, NotificationTypeRequest notificationTypeRequest) {
//        return null;
//    }
}
