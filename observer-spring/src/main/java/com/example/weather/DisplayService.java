package com.example.weather;

import com.example.weather.events.TemperatureChangedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class DisplayService {

    private final ApplicationEventPublisher eventPublisher;

    public DisplayService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void changeTemperature(double newTemperature) {
        //do something
        eventPublisher.publishEvent(new TemperatureChangedEvent(newTemperature));
    }
}
