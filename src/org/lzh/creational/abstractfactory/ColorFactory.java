package org.lzh.creational.abstractfactory;

import org.lzh.creational.abstractfactory.service.Color;
import org.lzh.creational.abstractfactory.service.Shape;
import org.lzh.creational.abstractfactory.service.impl.*;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if (null == color){
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        if (color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
