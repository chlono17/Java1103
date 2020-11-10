package com.ocp3;

public class ArrayDemo3 {

    public static void main(String[] args) {
        int[] score = new int[]{10, 9, 8}; //int[] score = {100,90,80};
        score = new int[]{100, 90, 80};
        System.out.println("列出成績");
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println("總分");
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println(sum);
        System.out.println("平均");
        System.out.println(sum / score.length);
    }

}
