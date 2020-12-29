package com.ocp15;

//群組 GroupBy, 數量 count, 排序 sort 
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByDemo {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "apple", "banana",
                "apple", "banana", "watermelon", "orange");
        //分組
        Map<String, Long> result = fruits.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
        System.out.println("----------------------------------------------");
        //排序
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(e -> System.out.println(e));
        System.out.println("----------------------------------------------");
       
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(e -> System.out.println(e));
        System.out.println("----------------------------------------------");
        
        result.entrySet().stream()
                .sorted((a, b) -> (int) (b.getValue() - a.getValue()))
                .forEach(e -> System.out.println(e));
        //將排序結果放入到Map
        Map map = new LinkedHashMap();
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(e -> map.put(e.getKey(), e.getValue()));
        System.out.println(map);
                }

}
