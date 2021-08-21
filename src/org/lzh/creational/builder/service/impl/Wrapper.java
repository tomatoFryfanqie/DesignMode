package org.lzh.creational.builder.service.impl;

import org.lzh.creational.builder.service.Packing;

public class Wrapper implements Packing {
    @Override
    public String packing() {
        return "Wrapper";
    }
}
