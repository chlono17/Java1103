package com.ocp6;

public class ForLoop3 {
    public static void main(String[] args) {
        int[][][] nums ={
            {{100,90},{80,70},{60,50}},
            {{70,90},{80,100},{90,90},},
        };
        int sum = 0;
        //enhanced for-loop
        for (int[][] num : nums) {
            for (int[] nu : num) {
                for (int n : nu) {
                    System.out.println(n);
                    sum += n;
                }
            }
        }
        System.out.println(sum);
        //standard for loop
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int[][] num = nums[i];
            for (int j = 0; j < num.length; j++) {
                int nu[] = num[j];
                for (int k = 0; k < nu.length; k++) {
                    int n = nu[k];
                    sum1 += n;
                    System.out.println(n);
                }
            }
        }
        System.out.println(sum1);
        }
    }

