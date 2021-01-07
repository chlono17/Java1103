package com.pattern.decorator;

public class Bread extends Food{
    public Bread() {
        name ="麵包";
        price =40;
    } 

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

}
