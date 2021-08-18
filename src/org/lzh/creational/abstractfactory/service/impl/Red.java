package org.lzh.creational.abstractfactory.service.impl;

import org.lzh.creational.abstractfactory.service.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red");
    }
}
