package com.geelar.pattern.factory.abstractfactory;

/**
 * 工厂生成器
 */
public class FactoryProducer {
    private static AbstractFactory instance;

    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("Shape")) {
            instance = new ShapeFactory();
        } else if (factory.equalsIgnoreCase("Color")) {
            instance = new ColorFactory();
        }
        return instance;
    }
}
