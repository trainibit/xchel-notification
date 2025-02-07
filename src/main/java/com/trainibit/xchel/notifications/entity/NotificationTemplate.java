package com.trainibit.xchel.notifications.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@ToString
@Entity(name = "notification_template")
public class NotificationTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @Column(name = "content", nullable = false, length = Integer.MAX_VALUE)
    private String content;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "notification_type_id", nullable = false)
    private NotificationType notificationTypeUuid;

    @ColumnDefault("1")
    @Column(name = "priority")
    private Integer priority;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Timestamp createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @ColumnDefault("true")
    @Column(name = "active")
    private Boolean active;

}