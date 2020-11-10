package com.ocp3;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] score = new int[3]; //三科考試成績
        score[0] = 100;//國文
        score[1] = 90;//英文
        score[2] = 80;//數學
        int len = score.length; //score 陣列資料長度
        System.out.println(len);
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
    }
}
