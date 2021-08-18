package org.lzh.creational.abstractfactory.service.impl;

import org.lzh.creational.abstractfactory.service.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green");
    }
}
