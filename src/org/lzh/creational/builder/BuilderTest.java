package org.lzh.creational.builder;

public class BuilderTest {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal chickenAndCoffeeMeal = mealBuilder.ChickenAndCoffeeMeal();
        chickenAndCoffeeMeal.showBill();
        chickenAndCoffeeMeal.getCost();

        Meal chickenAndCokeMeal = mealBuilder.ChickenAndCokeMeal();
        chickenAndCokeMeal.showBill();
        chickenAndCokeMeal.getCost();
    }
}
