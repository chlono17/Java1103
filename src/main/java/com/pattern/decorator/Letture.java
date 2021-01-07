package com.pattern.decorator;

public class Letture extends SideDish{
    public Letture(Food food){
        super(food);
        name = "生菜";
        price = 15;
    }
}
