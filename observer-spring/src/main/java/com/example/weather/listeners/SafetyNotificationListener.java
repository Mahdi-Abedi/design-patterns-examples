package com.example.weather.listeners;

import com.example.weather.events.SafetyNotificationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SafetyNotificationListener {

    @EventListener
    @Async
    public void onSafetyNotification(SafetyNotificationEvent event) {
        //do something here
        System.out.println("Temperature is " + event.currentTemperature() + ".This is too " + (event.currentTemperature() > 0 ? " hot." : "could."));
    }
}
