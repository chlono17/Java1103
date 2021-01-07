package com.ocp13_collection_set;

import java.util.HashSet;   //Set set = new HashSet();
import java.util.LinkedHashSet; //Set set = new LinkedHashSet();
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        //今彩539, 1~39中取五個不重複的數字
        //電腦選號
        while (set.size() < 5) {            
            //產生一個1~39的隨機數
            int n = new Random().nextInt(39) + 1;
            set.add(n);
            System.out.println("加入 ==>" + n);
        }
        System.out.println(set);
        
        //彩球的號碼總和
        //java 7
        int sum = 0;
        for (Object object : set) {
            if(object instanceof Integer){
                sum += (Integer)object;
            }
        }
        System.out.println(sum);
        
        //java 8
         int sum2 = set.stream().mapToInt(e -> (Integer)e).sum();
//[標準] int sum2 = set.stream().mapToInt(e -> ((Integer)e).intValue()).sum();
        System.out.println(sum2);
    }
    
}
