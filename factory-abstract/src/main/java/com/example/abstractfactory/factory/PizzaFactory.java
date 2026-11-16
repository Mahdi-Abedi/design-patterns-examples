package com.example.abstractfactory.factory;

import com.example.abstractfactory.cheese.Cheese;
import com.example.abstractfactory.dough.Dough;
import com.example.abstractfactory.sauce.Sauce;

public interface PizzaFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
}
