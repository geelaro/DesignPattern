package com.geelar.pattern.factory.abstractfactory;

import com.geelar.pattern.factory.inface.Color;
import com.geelar.pattern.factory.inface.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
    abstract Color getColor(String colorType);
}
