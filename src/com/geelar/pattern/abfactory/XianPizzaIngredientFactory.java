package com.geelar.pattern.abfactory;

import com.geelar.pattern.abfactory.ingredient.*;

public class XianPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
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
