package com.example;

import com.example.weather.observer.CurrentConditionsDisplay;
import com.example.weather.observer.ForecastDisplay;
import com.example.weather.observer.StatisticsDisplay;
import com.example.weather.observer.ThirdPartyDisplay;
import com.example.weather.subject.WeatherData;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var subject = new WeatherData();

        var observer1 = new CurrentConditionsDisplay(subject);
        var observer2 = new StatisticsDisplay(subject);
        var observer3 = new ForecastDisplay(subject);
        var observer4 = new ThirdPartyDisplay(subject);

        subject.notifyObservers();;

    }
}
