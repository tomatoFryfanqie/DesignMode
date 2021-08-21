package org.lzh.creational.builder.service.impl;

import org.lzh.creational.builder.service.Drink;

public class CokeDrink extends Drink {
    @Override
    public String foodName() {
        return "CokeDrink";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
