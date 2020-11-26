package com.ocp8;
//交通工具(父親別)

public class Transportation {

    private String name;
    private int amount;
    private int km;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getkm() {
        return km;
    }

    public void setkm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Transportation{"  + name + ", 庫存=" + amount + ", km=" + km + ", 費用=" + price + '}';
    }

    
}
