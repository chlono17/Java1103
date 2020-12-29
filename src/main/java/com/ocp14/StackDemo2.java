package com.ocp14;

import java.util.EnumSet;
import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        //利用堆疊實作字串反串反轉並印出
        String str = "java";
        //將每一個字放入到堆疊
        Stack<Character> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));
        }
        System.out.println(stack);
        System.out.print("反轉:");
        while (!stack.isEmpty()) {            
            System.out.print(stack.pop());
        }
    }
}

