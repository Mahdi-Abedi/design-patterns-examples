package com.example.simplefactory;

public sealed interface Notification permits EmailNotification, SmsNotification, PushNotification{
    void delivery();
}
