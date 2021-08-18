package org.lzh.creational.abstractfactory;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.bcel.internal.generic.RET;
import org.lzh.creational.abstractfactory.service.Color;
import org.lzh.creational.abstractfactory.service.Shape;
import org.lzh.creational.abstractfactory.service.impl.Circle;
import org.lzh.creational.abstractfactory.service.impl.Rectangle;
import org.lzh.creational.abstractfactory.service.impl.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (null == shape){
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
