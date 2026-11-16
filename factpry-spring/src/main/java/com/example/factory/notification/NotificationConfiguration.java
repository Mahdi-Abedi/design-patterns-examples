package com.example.factory.notification;

import com.example.factory.notification.EmailNotification;
import com.example.factory.notification.notifications.Notification;
import com.example.factory.notification.notifications.PushNotification;
import com.example.factory.notification.notifications.SmsNotification;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties(NotificationProperties.class)
@ConfigurationPropertiesScan("com.example.factory")
@PropertySource("classpath:application.yaml")
public class NotificationConfiguration {

    @Bean
    public Notification notification(NotificationProperties properties) {
        return switch (properties.type()) {
            case EMAIL -> new EmailNotification(properties.smtpHost(), properties.smtpPort());
            case SMS   -> new SmsNotification(properties.smsApiKey());
            case PUSH  -> new PushNotification(properties.pushServiceUrl());
        };
    }
}
