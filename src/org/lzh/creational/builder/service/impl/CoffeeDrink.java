package org.lzh.creational.builder.service.impl;

import org.lzh.creational.builder.service.Drink;

public class CoffeeDrink extends Drink {
    @Override
    public String foodName() {
        return "CoffeeDrink";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
