package com.geelar.pattern.factory.factorymethod;

import com.geelar.pattern.factory.inface.Shape;

/**
 * 工厂方法模式
 * 画布，在此画出各种图形
 */
public class Canvas {

    public static void main(String[] args){

        //
        ShapeFactory shapeFactory = new ShapeFactory();
        //画一个圆形
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        //画一个方框
        Shape square = shapeFactory.getShape("Square");
        square.draw();

    }
}
