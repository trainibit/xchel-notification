package com.trainibit.xchel.notifications.request;

import com.trainibit.xchel.notifications.entity.Notification;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class NotificationRequest {
    private Long id;
    private UUID uuid;
    private UUID userUuid;
    private Timestamp sendDate;
    private Notification notificationTemplate;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean active;
}
