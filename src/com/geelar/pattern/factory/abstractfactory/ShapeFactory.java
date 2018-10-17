package com.geelar.pattern.factory.abstractfactory;

import com.geelar.pattern.factory.inface.Color;
import com.geelar.pattern.factory.inface.Shape;
import com.geelar.pattern.factory.shapeImpl.Circle;
import com.geelar.pattern.factory.shapeImpl.Rectangle;
import com.geelar.pattern.factory.shapeImpl.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        Shape shape = null;
        if (shapeType.equalsIgnoreCase("Circle")) {
            shape = new Circle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            shape = new Square();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            shape = new Rectangle();
        }

        return shape;
    }

    @Override
    Color getColor(String colorType) {
        return null;
    }
}
