package com.ocp9;


public class MultiAdd {
    public static void add(int x, int y){
        System.out.println(x + y);
    }   
    
     public static void add(int...nums){
        int sum = 0;          //^省略符號只能有一個int...nums , double...nums(x)
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add(0);
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30, 40);
        add(10, 20, 30 ,40 ,50);
        int[] nums ={10, 20, 30, 40,50};
        add(nums);
    }
}
