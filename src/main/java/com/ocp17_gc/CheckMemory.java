package com.ocp17_gc;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

public class CheckMemory {

    public static void main(String[] args) {
        System.out.printf("%d bytes\n", Runtime.getRuntime().freeMemory());
        
        Faker faker = new Faker();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add(faker.name().lastName());
        }
        System.out.printf("%d bytes\n", Runtime.getRuntime().freeMemory());
        
        names = null;//將names 指向 null , 原建立物件仍存在
        System.out.printf("%d bytes\n", Runtime.getRuntime().freeMemory());
        
        faker = null;
        System.out.printf("%d bytes\n", Runtime.getRuntime().freeMemory());
        
        System.gc();//建議系統執行GC
        System.out.printf("%d bytes\n", Runtime.getRuntime().freeMemory());

    }

}
