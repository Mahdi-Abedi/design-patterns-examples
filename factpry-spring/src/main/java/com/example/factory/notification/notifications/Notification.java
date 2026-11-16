package com.example.factory.notification.notifications;

public sealed interface Notification permits PushNotification, EmailNotification, SmsNotification {
    void send(String to, String body);
}