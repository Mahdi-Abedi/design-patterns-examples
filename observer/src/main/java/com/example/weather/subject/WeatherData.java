package com.example.weather.subject;

import com.example.weather.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public final class WeatherData implements Subject {

    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove( observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
