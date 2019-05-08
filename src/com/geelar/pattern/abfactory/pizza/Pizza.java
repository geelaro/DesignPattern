package com.geelar.pattern.abfactory.pizza;

import com.geelar.pattern.abfactory.ingredient.Cheese;
import com.geelar.pattern.abfactory.ingredient.Dough;
import com.geelar.pattern.abfactory.ingredient.Meat;

/**
 * 披萨
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Cheese cheese;
    protected Meat meat;

    public abstract void prepare();

    public void pack() {
        System.out.println(name + ": 包装");
    }

    public void cut() {
        System.out.println(name + ": 切割");
    }

    public void fire() {
        System.out.println(name + ": 烘烤制作");
    }

}
