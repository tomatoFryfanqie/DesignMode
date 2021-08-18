package org.lzh.creational.abstractfactory.service.impl;

import org.lzh.creational.abstractfactory.service.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
