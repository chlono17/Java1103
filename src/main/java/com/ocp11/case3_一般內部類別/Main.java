package com.ocp11.case3_一般內部類別;

public class Main {
    public static void main(String[] args) {
        //第一種宣告方法
        //Bar.Foo foo = new Bar(). new Foo();
        //foo.printMe();
        
        //第二種宣告方法
        Bar bar = new Bar();
        Bar.Foo foo = bar.new Foo();
        foo.printMe();
        
        //第三種宣告方法
        new Bar().new Foo().printMe();
    }
}
