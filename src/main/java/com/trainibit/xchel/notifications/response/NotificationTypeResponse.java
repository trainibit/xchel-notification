package com.trainibit.xchel.notifications.response;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class NotificationTypeResponse {
    private UUID uuid;
    private String description;
    private String createdAt;
    private String updatedAt;
    private Boolean active;
}
