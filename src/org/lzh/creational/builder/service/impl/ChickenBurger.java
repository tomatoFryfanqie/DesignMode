package org.lzh.creational.builder.service.impl;

import org.lzh.creational.builder.service.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String foodName() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
