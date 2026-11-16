package com.example;

import com.example.simplefactory.NotificationFactory;
import com.example.simplefactory.NotificationType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       var notification = NotificationFactory.create(NotificationType.EMAIL);
       notification.delivery();
    }
}
