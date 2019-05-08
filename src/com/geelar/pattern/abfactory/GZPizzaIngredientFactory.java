package com.geelar.pattern.abfactory;

import com.geelar.pattern.abfactory.ingredient.Chashao;
import com.geelar.pattern.abfactory.ingredient.Cheese;
import com.geelar.pattern.abfactory.ingredient.Dough;
import com.geelar.pattern.abfactory.ingredient.Meat;

public class GZPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Meat createMeat() {
        return new Chashao();
    }
}
