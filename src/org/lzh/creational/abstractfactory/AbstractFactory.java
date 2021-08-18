package org.lzh.creational.abstractfactory;

import org.lzh.creational.abstractfactory.service.Color;
import org.lzh.creational.abstractfactory.service.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
