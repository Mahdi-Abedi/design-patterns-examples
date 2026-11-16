package com.example.factory.notification.notifications;

public final class EmailNotification implements Notification {
    private final String host;
    private final int port;

    public EmailNotification(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public void send(String to, String body) {
        System.out.printf("[EMAIL via %s:%d] to=%s: %s%n", host, port, to, body);
    }
}