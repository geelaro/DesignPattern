package com.geelar.pattern.factory.shapeImpl;

import com.geelar.pattern.factory.inface.Shape;

/**
 * 圆形
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Circle.");
    }
}
