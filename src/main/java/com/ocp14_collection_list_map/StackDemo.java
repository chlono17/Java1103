package com.ocp14_collection_list_map;

import com.github.javafaker.Faker;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String>  stack = new Stack<>();
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            stack.add(faker.name().lastName());
            System.out.println(stack);
        }
        System.out.println("依序進電梯" + stack);
        while (!stack.isEmpty()) {            
            String name = stack.pop();
            System.out.printf("%s 從電梯出來 ,電梯內還有 %s\n", name , stack);
        }
                
    }
    
}
