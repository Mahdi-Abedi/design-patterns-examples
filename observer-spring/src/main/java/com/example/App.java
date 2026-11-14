package com.example;

import com.example.weather.DisplayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) throws InterruptedException {
        // ۱. ساخت کانتکست با اسکن پکیج اصلی (شامل همه @Component/@Service/@Configuration)
        try (var context = new AnnotationConfigApplicationContext("com.example.weather")) {

            // ۲. گرفتن Bean از کانتکست
            DisplayService displayService = context.getBean(DisplayService.class);

            // ۳. سناریوی اول: دمای عادی (هیچ listener خطر فعال نمی‌شود)
            System.out.println("=== Normal temperature (25.0) ===");
            displayService.changeTemperature(25.0);

            // ۴. سناریوی دوم: دمای خطرناک (بیش از ۱۰۰) - زنجیره رویداد فعال می‌شود
            System.out.println("\n=== Dangerous: too hot (150.0) ===");
            displayService.changeTemperature(150.0);

            // ۵. سناریوی سوم: دمای خطرناک (کمتر از ۰)
            System.out.println("\n=== Dangerous: too cold (-10.0) ===");
            displayService.changeTemperature(-10.0);

            // ۶. صبر کوتاه تا تسک‌های @Async روی virtual threadها اجرا شوند
            Thread.sleep(500);
        }
    }
}