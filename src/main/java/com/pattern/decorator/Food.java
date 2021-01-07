package com.pattern.decorator;

public abstract class Food {
    protected String name;    //品名
    protected int price;    //價格
    public abstract int getPrice();
    public abstract String getName();    
}
