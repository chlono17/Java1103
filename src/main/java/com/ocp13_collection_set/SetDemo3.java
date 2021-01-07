package com.ocp13_collection_set;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        //集合與泛型<>
        Set set = new LinkedHashSet();
        while (set.size() < 5) {            
            set.add(new Random().nextInt(39) +1);
        }
        set.add("雜質");
        System.out.println(set);
        set.remove("雜質");
        System.out.println(set);
        
        //----------------------------------------------------------------------
            //可改String
        Set<Integer> set2 = new LinkedHashSet<>(); 
        
        while (set2.size() < 5) {            
            set2.add(new Random().nextInt(39) + 1);
        }// integer陣列
        
        //set2.add("雜質");  無法擺入非Integer的資料
        System.out.println(set2);
        //e -> e.IntValue() Integer 調用 e.intValue() 轉成 int
        //set2.stream().mapToInt(e -> e.intValue()).sum();
        int sum = set2.stream().mapToInt(e -> e).sum();
        System.out.println(sum);
    }
}
