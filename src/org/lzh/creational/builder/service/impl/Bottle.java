package org.lzh.creational.builder.service.impl;

import org.lzh.creational.builder.service.Packing;

public class Bottle implements Packing {
    @Override
    public String packing() {
        return "Bottle";
    }
}
