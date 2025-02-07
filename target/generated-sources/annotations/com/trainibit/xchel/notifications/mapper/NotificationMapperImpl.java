package com.trainibit.xchel.notifications.mapper;

import com.trainibit.xchel.notifications.entity.Notification;
import com.trainibit.xchel.notifications.request.NotificationRequest;
import com.trainibit.xchel.notifications.response.NotificationResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-06T17:57:28-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class NotificationMapperImpl implements NotificationMapper {

    @Override
    public Notification mapDtoToEntity(NotificationRequest notificationRequest) {
        if ( notificationRequest == null ) {
            return null;
        }

        Notification notification = new Notification();

        notification.setId( notificationRequest.getId() );
        notification.setUuid( notificationRequest.getUuid() );
        notification.setUserUuid( notificationRequest.getUserUuid() );
        notification.setSendDate( notificationRequest.getSendDate() );
        notification.setStatus( notificationRequest.getStatus() );
        notification.setCreatedAt( notificationRequest.getCreatedAt() );
        notification.setUpdatedAt( notificationRequest.getUpdatedAt() );
        notification.setActive( notificationRequest.getActive() );

        return notification;
    }

    @Override
    public NotificationResponse mapEntityToDto(Notification notification) {
        if ( notification == null ) {
            return null;
        }

        NotificationResponse notificationResponse = new NotificationResponse();

        notificationResponse.setUuid( notification.getUuid() );
        notificationResponse.setUserUuid( notification.getUserUuid() );
        notificationResponse.setSendDate( notification.getSendDate() );
        notificationResponse.setNotificationTemplate( notification.getNotificationTemplate() );
        notificationResponse.setStatus( notification.getStatus() );
        notificationResponse.setCreatedAt( notification.getCreatedAt() );
        notificationResponse.setUpdatedAt( notification.getUpdatedAt() );
        notificationResponse.setActive( notification.getActive() );

        return notificationResponse;
    }

    @Override
    public List<NotificationResponse> mapEntityToDtoList(List<Notification> notification) {
        if ( notification == null ) {
            return null;
        }

        List<NotificationResponse> list = new ArrayList<NotificationResponse>( notification.size() );
        for ( Notification notification1 : notification ) {
            list.add( mapEntityToDto( notification1 ) );
        }

        return list;
    }

    @Override
    public Notification requestToEntity(NotificationRequest notificationRequest) {
        if ( notificationRequest == null ) {
            return null;
        }

        Notification notification = new Notification();

        notification.setId( notificationRequest.getId() );
        notification.setUuid( notificationRequest.getUuid() );
        notification.setUserUuid( notificationRequest.getUserUuid() );
        notification.setSendDate( notificationRequest.getSendDate() );
        notification.setStatus( notificationRequest.getStatus() );
        notification.setCreatedAt( notificationRequest.getCreatedAt() );
        notification.setUpdatedAt( notificationRequest.getUpdatedAt() );
        notification.setActive( notificationRequest.getActive() );

        return notification;
    }
}
