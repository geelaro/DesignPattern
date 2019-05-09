package com.geelar.pattern.abfactory;

import com.geelar.pattern.abfactory.ingredient.*;

public class GZPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Meat createMeat() {
        return new Chashao();
    }
}
