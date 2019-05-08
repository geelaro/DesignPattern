package com.geelar.pattern.abfactory;

import com.geelar.pattern.abfactory.ingredient.Cheese;
import com.geelar.pattern.abfactory.ingredient.Dough;
import com.geelar.pattern.abfactory.ingredient.Meat;

/**
 * 抽象原料工厂
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Cheese createCheese();

    public Meat createMeat();


}

