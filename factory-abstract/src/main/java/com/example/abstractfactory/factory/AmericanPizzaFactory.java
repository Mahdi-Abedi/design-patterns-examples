package com.example.abstractfactory.factory;

import com.example.abstractfactory.cheese.AmericanCheese;
import com.example.abstractfactory.cheese.Cheese;
import com.example.abstractfactory.cheese.ItalianCheese;
import com.example.abstractfactory.dough.AmericanDough;
import com.example.abstractfactory.dough.Dough;
import com.example.abstractfactory.dough.ItalianDough;
import com.example.abstractfactory.sauce.AmericanSauce;
import com.example.abstractfactory.sauce.ItalianSauce;
import com.example.abstractfactory.sauce.Sauce;

public class AmericanPizzaFactory implements PizzaFactory{
    @Override
    public Dough createDough() {
        return new AmericanDough();
    }

    @Override
    public Sauce createSauce() {
        return new AmericanSauce();
    }

    @Override
    public Cheese createCheese() {
        return new AmericanCheese();
    }
}
