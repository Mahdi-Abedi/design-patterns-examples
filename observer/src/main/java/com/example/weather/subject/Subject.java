package com.example.weather.subject;

import com.example.weather.observer.Observer;

public sealed interface Subject permits WeatherData{

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
