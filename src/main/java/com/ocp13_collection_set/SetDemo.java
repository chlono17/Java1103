package com.ocp13_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
/*
    set{    HashSet
       {    LinkedHashSet   有順序
       {    TreeSet     有順序有排序
 */    
    public static void main(String[] args) {
        Set set = new HashSet();    //特性:元素之間的擺放是按照Hashcode來決定,提高元素查詢的速率
        set.add("國文");//String
        set.add(100);//不是int 而是integer
        set.add("英文");//String
        set.add(Integer.valueOf(100));//integer
        set.add("數學");
        set.add(new Integer("90"));
        System.out.println(set);
        System.out.println("----------------------------------");
        //for-loop
        for (Object obj : set) {
            System.out.println(obj);
        }
        System.out.println("----------------------------------");
        //java 8
        set.forEach(e -> System.out.println(e));
        System.out.println("----------------------------------");
        set.forEach(System.out::println);
        //資料長度(元素個數)
        System.out.println(set.size());
    }

}
