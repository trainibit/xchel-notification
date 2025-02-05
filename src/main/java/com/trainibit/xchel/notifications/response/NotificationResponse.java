package com.trainibit.xchel.notifications.response;

import com.trainibit.xchel.notifications.entity.Notification;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
public class NotificationResponse {

    private UUID uuid;
    private UUID userUuid;
    private Timestamp sendDate;
    private Notification notificationTemplate;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean active;

}
