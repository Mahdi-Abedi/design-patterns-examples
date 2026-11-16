package com.example.abstractfactory.factory;

import com.example.abstractfactory.cheese.Cheese;
import com.example.abstractfactory.cheese.ItalianCheese;
import com.example.abstractfactory.dough.Dough;
import com.example.abstractfactory.dough.ItalianDough;
import com.example.abstractfactory.sauce.ItalianSauce;
import com.example.abstractfactory.sauce.Sauce;

public class ItalianPizzaFactory implements PizzaFactory{
    @Override
    public Dough createDough() {
        return new ItalianDough();
    }

    @Override
    public Sauce createSauce() {
        return new ItalianSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ItalianCheese();
    }
}
