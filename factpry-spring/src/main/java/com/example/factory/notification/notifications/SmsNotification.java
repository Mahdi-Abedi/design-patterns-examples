package com.example.factory.notification.notifications;

public final class SmsNotification implements Notification {
    private final String apiKey;

    public SmsNotification(String apiKey) { this.apiKey = apiKey; }

    @Override
    public void send(String to, String body) {
        System.out.printf("[SMS key=%s] to=%s: %s%n", apiKey, to, body);
    }
}