package com.ocp6;

public class SetMeal {

    private Hamburger hambuger;
    private SideMeal sideMeal;
    private Drink drink;
    private int sum;

    public SetMeal(Hamburger hambuger, SideMeal sideMeal, Drink drink) {
        this.hambuger = hambuger;
        this.sideMeal = sideMeal;
        this.drink = drink;
        this.sum = hambuger.getPrice() + sideMeal.getPrice() + drink.getPrice();
    }

    public int getSum() {
        return sum;
    }

    public Hamburger getHambuger() {
        return hambuger;
    }

    public void setHambuger(Hamburger hambuger) {
        this.hambuger = hambuger;
    }

    public SideMeal getSideMeal() {
        return sideMeal;
    }

    public void setSideMeal(SideMeal sideMeal) {
        this.sideMeal = sideMeal;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

}
