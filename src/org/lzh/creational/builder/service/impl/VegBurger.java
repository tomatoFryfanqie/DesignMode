package org.lzh.creational.builder.service.impl;

import org.lzh.creational.builder.service.Burger;

public class VegBurger extends Burger {
    @Override
    public String foodName() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
