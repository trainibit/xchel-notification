package com.trainibit.xchel.notifications.request;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
public class NotificationTemplateRequest {
    private Long id;
    private UUID uuid;
    private String content;
    private UUID notificationTypeUuid;
    private Long priority;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean active;

}
