package com.ocp12.lambda5;

import java.util.function.Function;

public class CalcArea {
    public static void main(String[] args) {
        Function<Integer, Double>func = (x) -> Math.PI * Math.pow(x, 2);
        System.out.println(func.apply(10));
    }
}
