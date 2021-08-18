package org.lzh.creational.abstractfactory;

import org.lzh.creational.abstractfactory.service.Color;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color red = colorFactory.getColor("Red");
        red.fill();
    }
}
