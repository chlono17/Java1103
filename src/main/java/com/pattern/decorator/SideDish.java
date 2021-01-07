package com.pattern.decorator;

public class  SideDish extends Food{
    protected Food food;
    public SideDish(Food food){
        this.food = food;
    }

    @Override
    public int getPrice() {
         return price + food.getPrice();
    }

    @Override
    public String getName() {
        return name + " + " + food.getName();
    }
}
