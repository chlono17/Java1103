package com.ocp9;

class Father {

    public Father() {
        System.out.println("Father no money");
    }

    public Father(int money) {
        System.out.println("Fahter's money " + money);
    }
}

class Son extends Father {

    public Son() {
        super();//可不寫
        //super(11) print:Fahter's money 1
    }
}

public class Family {

    public static void main(String[] args) {
        Son son = new Son();
    }
}
