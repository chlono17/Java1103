package com.ocp13;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class SetDemo4 {

    public static void main(String[] args) {
        Set<Exam> exams = new LinkedHashSet();
        IntStream.rangeClosed(1, 20).forEach(i -> exams.add(new Exam()));//編20個人的成績資料
        System.out.println("全班成績" + exams);

        System.out.println("1. 國文平均");
        //印出所有國文分數
        exams.stream()
                .mapToInt(e -> e.getChinese())
                .forEach(score -> System.out.print(score + ","));
        //計算國文平均
        double avg_chinese = exams.stream()
                .mapToInt(e -> e.getChinese())
                .average()
                .getAsDouble();
        System.out.println("平均" + avg_chinese);

        System.out.println("2. 英文平均");
        //印出所有英文分數
        exams.stream()
                .mapToInt(e -> e.getEnglish())
                .forEach(score -> System.out.print(score + ","));
        //計算英文平均
        double avg_english = exams.stream()
                .mapToInt(e -> e.getEnglish())
                .average()
                .getAsDouble();
        System.out.println("平均" + avg_english);

        System.out.println("3. 數學平均");
        //印出所有數學分數
        exams.stream()
                .mapToInt(e -> e.getMath())
                .forEach(score -> System.out.print(score + ","));
        //計算數學平均
        double avg_math = exams.stream()
                .mapToInt(e -> e.getMath())
                .average()
                .getAsDouble();
        System.out.println("平均" + avg_math);

        //國文最高分數
        int max_chinese = exams.stream()
                .mapToInt(e -> e.getChinese())
                .max().getAsInt();
        System.out.println("國文最高分" + max_chinese);

        //國文最高分的人名
        exams.stream()
                .filter(e -> e.getChinese() == max_chinese)
                .forEach(e -> System.out.print(e.getName() + ","));
        System.out.println("");
        //求出總分最高
        int score = exams.stream().mapToInt(e -> e.getChinese() + e.getEnglish() + e.getMath()).max().getAsInt();
        System.out.println(score);
        //求出總分最高的人
        exams.stream()
                .filter(e -> e.getChinese() + e.getEnglish() + e.getMath() == score)
                .forEach(e -> System.out.print(e.getName() + ","));
        System.out.println("");

    }
}
