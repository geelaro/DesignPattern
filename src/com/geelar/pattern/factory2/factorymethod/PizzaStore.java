package com.geelar.pattern.factory2.factorymethod;

import com.geelar.pattern.factory2.base.Pizza;

/**
 * 工厂方法模式：把类实例化的过程推迟到子类。
 * 定义一个创建对象的接口，但由子类决定要实例化的类是哪一个
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    /**
     * 根据传入type不同卖不同类型的Pizza
     * @param type
     * @return Pizza
     */
    public Pizza sellPizza(String type){
        Pizza pizza = createPizza(type);
        //制作
        pizza.prepare();
        pizza.fire();
        pizza.cut();
        pizza.pack();

        return pizza;
    }
}
