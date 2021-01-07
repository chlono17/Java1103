package com.ocp16_exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        bar();      //直接使用即可
//      foo();      必須使用try-catch 或 throws 拋出
    }
    public static void foo() throws Exception{  //checked Exception
        System.out.println("foo");
    }
    
    public static void bar() throws RuntimeException{   //unchecked Exception
        System.out.println("bar");
    }
    
}
