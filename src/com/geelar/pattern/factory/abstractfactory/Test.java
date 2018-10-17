package com.geelar.pattern.factory.abstractfactory;

import com.geelar.pattern.factory.inface.Color;
import com.geelar.pattern.factory.inface.Shape;

/**
 * 演示抽象工厂模式
 */
public class Test {

    public static void main(String[] agrs) {
        //get ShapeFactory object
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        //get a circle object
        Shape circle = shapeFactory.getShape("Circle");
        //draw
        circle.draw();
        //get a square and draw
        Shape square = shapeFactory.getShape("Square");
        square.draw();

        //get ColorFactory
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        //get a red object
        Color red = colorFactory.getColor("red");
        //fill
        red.fill();


    }
}
