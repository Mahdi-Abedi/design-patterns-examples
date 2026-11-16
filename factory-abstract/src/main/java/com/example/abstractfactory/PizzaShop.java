package com.example.abstractfactory;

import com.example.abstractfactory.cheese.Cheese;
import com.example.abstractfactory.dough.Dough;
import com.example.abstractfactory.factory.PizzaFactory;
import com.example.abstractfactory.sauce.Sauce;

public class PizzaShop {
    private final PizzaFactory factory;

    public PizzaShop(PizzaFactory factory) {
        this.factory = factory;
    }

    public void makePizza() {
        Dough dough  = factory.createDough();
        Sauce sauce  = factory.createSauce();
        Cheese cheese = factory.createCheese();

        System.out.println(dough.describe());
        System.out.println(sauce.describe());
        System.out.println(cheese.describe());
    }
}
