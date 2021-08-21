package org.lzh.creational.builder;

import org.lzh.creational.builder.service.FoodAndPacingItem;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<FoodAndPacingItem> foodAndPacingItems = new ArrayList<>();

    public void addItem(FoodAndPacingItem item){
        foodAndPacingItems.add(item);
    }
    public void getCost(){
        float cost = 0.0f;
        for (FoodAndPacingItem foodAndPacingItem : foodAndPacingItems) {
            cost += foodAndPacingItem.price();
        }
        System.out.println("You Need Pay: "+cost);
    }
    public void showBill(){
        for (FoodAndPacingItem foodAndPacingItem : foodAndPacingItems) {
            System.out.println("foodName: " + foodAndPacingItem.foodName());
            System.out.println("Packing: " + foodAndPacingItem.pacing().packing());
            System.out.println("Price: " + foodAndPacingItem.price());
        }
    }
}
