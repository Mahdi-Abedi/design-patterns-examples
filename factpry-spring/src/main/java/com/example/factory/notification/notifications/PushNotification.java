package com.example.factory.notification.notifications;


public final class PushNotification implements Notification {
    private final String serviceUrl;

    public PushNotification(String serviceUrl) { this.serviceUrl = serviceUrl; }

    @Override
    public void send(String to, String body) {
        System.out.printf("[PUSH %s] to=%s: %s%n", serviceUrl, to, body);
    }
}