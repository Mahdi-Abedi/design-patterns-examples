package com.example.factory.notification;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "notification")
public record NotificationProperties(
        NotificationType type,
        String smtpHost,
        int smtpPort,
        String smsApiKey,
        String pushServiceUrl) {
}