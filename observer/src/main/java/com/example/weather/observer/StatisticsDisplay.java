package com.example.weather.observer;

import com.example.weather.subject.Subject;

public final class StatisticsDisplay implements Observer {
    private final Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + " is updated");
    }
}
