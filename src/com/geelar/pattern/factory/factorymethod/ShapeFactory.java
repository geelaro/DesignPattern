package com.geelar.pattern.factory.factorymethod;

import com.geelar.pattern.factory.inface.Shape;
import com.geelar.pattern.factory.shapeImpl.Circle;
import com.geelar.pattern.factory.shapeImpl.Square;

public class ShapeFactory {

    public Shape getShape(String type){

        Shape shape=null;
        if (type.equalsIgnoreCase("Circle")){
            shape = new Circle();
        } else if (type.equalsIgnoreCase("Square")){
            shape = new Square();
        }
        return shape;
    }
}
