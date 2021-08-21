package org.lzh.creational.builder.service;

import org.lzh.creational.builder.service.FoodAndPacingItem;
import org.lzh.creational.builder.service.Packing;
import org.lzh.creational.builder.service.impl.Bottle;

public abstract class Drink implements FoodAndPacingItem {

    @Override
    public Packing pacing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
