package com.ocp12.lambda4;

import java.util.function.Consumer;

/*
Consumer
-接受一個引數,然後處理後不傳回值
Function
-接受一個引數,然後以該引數進行計算後傳回任意結果
Predicate
-接受一個引數,只然後回傳boolean值
Supplier
-不接受任何引數,然後傳回值
 */
public class Main {

    public static void main(String[] args) {
        Print print1 = (x) -> {
            System.out.println(x);
        };
        Print print2 = System.out::println;

        print1.display(100);
        print2.display(100);

        //使用 Consumer
        //void accept(T t)
        Consumer<String> consumer = (x) -> System.out.println(x + x);
        consumer.accept("Ha");
    }
}
