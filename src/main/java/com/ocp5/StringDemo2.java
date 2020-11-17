package com.ocp5;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = "java";
        s1 =s1.intern();    //將字串移入到 String pool
        //s1 =s2; //改變s1的指向位置
        System.out.println(s1==s2);
        
    }
}
