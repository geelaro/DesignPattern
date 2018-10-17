package com.geelar.pattern.factory.abstractfactory;

import com.geelar.pattern.factory.colorImpl.Blue;
import com.geelar.pattern.factory.colorImpl.Green;
import com.geelar.pattern.factory.colorImpl.Red;
import com.geelar.pattern.factory.inface.Color;
import com.geelar.pattern.factory.inface.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String colorType) {
        Color color = null;
        if (colorType.equalsIgnoreCase("Red")) {
            color = new Red();
        } else if (colorType.equalsIgnoreCase("Blue")) {
            color = new Blue();
        } else if (colorType.equalsIgnoreCase("Green")) {
            color = new Green();
        }
        return color;
    }
}
