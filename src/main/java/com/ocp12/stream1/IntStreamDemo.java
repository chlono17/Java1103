package com.ocp12.stream1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {
    public static void main(String[] args) {
        int[] nums ={100, 50, 70, 30};
        //印出及格的分數的總和
        //Before Java
        int sum = 0;
        for (int num : nums) {
            if (num>=60) {
                sum +=num;
            }
        }
        System.out.println(sum);
        //Java 8
        int sum2 = IntStream.of(nums).filter(x -> x >= 60).sum();
        System.out.println(sum2);
    }
    
  
}
