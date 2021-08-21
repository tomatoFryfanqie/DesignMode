package org.lzh.creational.builder.service;

import org.lzh.creational.builder.service.FoodAndPacingItem;
import org.lzh.creational.builder.service.Packing;
import org.lzh.creational.builder.service.impl.Wrapper;

public abstract class Burger implements FoodAndPacingItem {

    @Override
    public Packing pacing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
