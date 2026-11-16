package com.example.simplefactory;

public class NotificationFactory {
    private NotificationFactory() {
    }

    public static Notification create(NotificationType type) {
        return switch (type) {
            case EMAIL -> new EmailNotification();
            case SMS -> new SmsNotification();
            case PUSH -> new PushNotification();
        };

    }
}
