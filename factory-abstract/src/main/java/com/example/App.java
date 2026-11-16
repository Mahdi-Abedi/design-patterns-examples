package com.example;

import com.example.abstractfactory.PizzaShop;
import com.example.abstractfactory.factory.AmericanPizzaFactory;
import com.example.abstractfactory.factory.ItalianPizzaFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PizzaShop italianShop = new PizzaShop(new ItalianPizzaFactory());
        italianShop.makePizza();

        System.out.println("───────────────");

        PizzaShop americanShop = new PizzaShop(new AmericanPizzaFactory());
        americanShop.makePizza();    }
}
