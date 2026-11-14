package com.example.weather.observer;

import com.example.weather.subject.Subject;

public final class CurrentConditionsDisplay implements Observer {
    private final Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + " is updated");
    }
}
