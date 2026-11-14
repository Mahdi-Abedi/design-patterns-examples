package com.example.weather.observer;

public sealed interface Observer permits CurrentConditionsDisplay, StatisticsDisplay, ForecastDisplay, ThirdPartyDisplay {
    void update();
}
