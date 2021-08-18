package org.lzh.creational.abstractfactory.service.impl;

import org.lzh.creational.abstractfactory.service.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
