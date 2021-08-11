package org.lzh.creational.factory.service.impl;

import org.lzh.creational.factory.service.Computer;

public class Dell implements Computer {
    @Override
    public void sellComputer() {
        System.out.println("你买了台Dell");
    }
}
