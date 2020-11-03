package com.ocp;

public class Clac {
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.h = 100;
        a1.w = 50;
        //沒回傳值得方法
        a1.calcAndPrint();
        //有回傳值得方法
        int sum = a1.CalcNotPrint();
        System.out.println(sum);
        //-------------------------------------------
        BMI bmi = new BMI();
        bmi.h =170.0;
        bmi.w =60.0;
        double b1 = bmi.calc();
        double b2 = bmi.calc(1);
        double b3 = bmi.calc(2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
