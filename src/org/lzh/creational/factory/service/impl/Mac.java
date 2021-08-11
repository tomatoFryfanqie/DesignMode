package org.lzh.creational.factory.service.impl;

import org.lzh.creational.factory.service.Computer;

public class Mac implements Computer {
    @Override
    public void sellComputer() {
        System.out.println("你买了台Mac");
    }
}
