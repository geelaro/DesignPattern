package com.geelar.pattern.factory.shapeImpl;

import com.geelar.pattern.factory.inface.Shape;

/**
 * 长方形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Rectangle.");
    }
}
