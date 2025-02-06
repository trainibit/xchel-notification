package com.trainibit.xchel.notifications.mapper;

import com.trainibit.xchel.notifications.entity.Notification;
import com.trainibit.xchel.notifications.request.NotificationRequest;
import com.trainibit.xchel.notifications.response.NotificationResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    Notification mapDtoToEntity(NotificationRequest notificationRequest);

    NotificationResponse mapEntityToDto(Notification notification);
}
