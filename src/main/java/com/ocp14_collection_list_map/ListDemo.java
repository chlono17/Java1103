package com.ocp14_collection_list_map;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> scores = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            scores.add(new Random().nextInt(11));
            System.out.println(scores);
        }
        System.out.println(scores);
        //排序
        Collections.sort(scores);   //工具 有小到大
        //去掉最前面兩個元素
        scores.remove(0);    //去掉位置零的元素
        scores.remove(0);    //再去掉位置零的元素
        System.out.println(scores);
         scores.remove(6); 
         scores.remove(scores.size()-1);
         System.out.println(scores);
         double final_scores = scores.stream()
                 .mapToInt(e -> e)
                 .average().getAsDouble();
         System.out.println("分數" + final_scores);
    }
}
