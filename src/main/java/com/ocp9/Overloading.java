package com.ocp9;

public class Overloading {

    public static void add(int x, int y) {
        System.out.println("int: " + (x + y));
    }

    public static void add(double x, double y) {
        System.out.println("double: " + (x + y));
    }

    public static void add(float x, float y) {
        System.out.println("float: " + (x + y));
    }

    public static void add(Integer x, Integer y) {
        System.out.println("Integer: " + (x + y));
    }

    public static void main(String[] args) {
        add(10, 20);
        add(10.0f, 20.0f);
        add(10.0, 20.0);
        add(10.0f, 20.0);
        add(10.0, 20.0f);
        add(2147483647L, 20L);
    }
}
