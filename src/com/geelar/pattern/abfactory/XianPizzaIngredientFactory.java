package com.geelar.pattern.abfactory;

import com.geelar.pattern.abfactory.ingredient.Cheese;
import com.geelar.pattern.abfactory.ingredient.Dough;
import com.geelar.pattern.abfactory.ingredient.Lamb;
import com.geelar.pattern.abfactory.ingredient.Meat;

public class XianPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    /**
     * 西安工厂使用羊肉
     *
     * @return
     */
    @Override
    public Meat createMeat() {
        return new Lamb();
    }
}
