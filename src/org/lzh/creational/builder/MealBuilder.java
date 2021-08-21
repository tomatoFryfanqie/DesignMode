package org.lzh.creational.builder;

import org.lzh.creational.builder.service.impl.ChickenBurger;
import org.lzh.creational.builder.service.impl.CoffeeDrink;
import org.lzh.creational.builder.service.impl.CokeDrink;
import org.lzh.creational.builder.service.impl.VegBurger;

public class MealBuilder {

    public Meal VegAndCoffeeMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new CoffeeDrink());
        return meal;
    }
    public Meal VegAndCokeMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new CokeDrink());
        return meal;
    }
    public Meal ChickenAndCoffeeMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new CoffeeDrink());
        return meal;
    }
    public Meal ChickenAndCokeMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new CokeDrink());
        return meal;
    }
}
