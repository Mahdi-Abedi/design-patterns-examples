package com.example.weather.listeners;

import com.example.weather.events.SafetyNotificationEvent;
import com.example.weather.events.TemperatureChangedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class TemperatureListener {

    @EventListener
    @Order(2)
    public void onTemperatureChanged(TemperatureChangedEvent event) {
        //do something here
        System.out.println("Temperature is change to " + event.newTemperature());

    }

    //id spring boot project use #event instead of #root.event.payload or #root.args[0] (#root.event.payload and #root.args[0] are equal)
    @EventListener(condition = "#root.event.payload.newTemperature() > 100 || #root.args[0].newTemperature() < 0")
    @Order(1)
    public SafetyNotificationEvent onTemperatureChangedDanger(TemperatureChangedEvent event) {
        //do something here
        System.out.println("Temperature is change to " + event.newTemperature() + ". Please check safety protocols.");

        //create a chain of events
        return new SafetyNotificationEvent(event.newTemperature());
    }
}
