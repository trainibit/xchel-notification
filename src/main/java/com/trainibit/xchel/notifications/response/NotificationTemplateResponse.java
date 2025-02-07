package com.trainibit.xchel.notifications.response;

import com.trainibit.xchel.notifications.entity.NotificationType;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
public class NotificationTemplateResponse {
    private UUID uuid;
    private String content;
    private NotificationType notificationTypeUuid;
    private Long priority;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean active;
}
