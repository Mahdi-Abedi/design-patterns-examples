package com.example.services;

import com.example.factory.notification.notifications.Notification;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final Notification notification;

    public OrderService(Notification notification) {
        this.notification = notification;
    }

    public void placeOrder(String to) {
        notification.send(to, "سفارش شما با موفقیت ثبت شد");
    }
}