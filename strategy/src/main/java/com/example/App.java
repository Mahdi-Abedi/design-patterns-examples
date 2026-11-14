package com.example;

import com.example.strategy.PercentageDiscount;

import java.math.BigDecimal;
import java.text.MessageFormat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var context = new DiscountContext();

        context.setStrategy(new PercentageDiscount(.1));
        BigDecimal finalPrice = context.calculate(BigDecimal.valueOf(100));

        System.out.println(MessageFormat.format("Final price for 100: {0}", finalPrice));
    }
}
