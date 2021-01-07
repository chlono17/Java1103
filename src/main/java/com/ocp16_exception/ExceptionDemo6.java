package com.ocp16_exception;

class Foo extends RuntimeException {//父1
}

class Bar extends RuntimeException {//父2   
}

class Sub extends Bar {//子2
}

public class ExceptionDemo6 {

    public static void main(String[] args) {
        try {
            System.out.println("");
        } catch (Foo | Bar e) {
        }

//        try {
//            System.out.println("");
//        } catch (Sub | Bar e) {   Bar 與 Sub 因為有繼承關係所以錯誤
//            
//        }
        try {
            System.out.println("");
        } catch (Foo | Sub e) {
        }
    }
}
