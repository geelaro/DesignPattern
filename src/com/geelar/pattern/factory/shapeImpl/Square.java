package com.geelar.pattern.factory.shapeImpl;

import com.geelar.pattern.factory.inface.Shape;

/**
 * 正方形
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Square .");
    }
}
