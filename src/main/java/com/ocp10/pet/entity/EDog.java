package com.ocp10.pet.entity;

public class EDog extends Dog{

    private int price;

    public EDog(int price) {
        this.price = price;
    }
    
    @Override
    public void eat() {
        System.out.println("吃3號電池2顆");
    }
    
    @Override
    public int getPrice() {
        return price;
    }
}