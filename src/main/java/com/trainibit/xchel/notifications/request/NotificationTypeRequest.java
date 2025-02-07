package com.trainibit.xchel.notifications.request;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class NotificationTypeRequest {

    private Long id;
    private UUID uuid;
    private String description;
    private String createdAt;
    private String updatedAt;
    private Boolean active;

}
