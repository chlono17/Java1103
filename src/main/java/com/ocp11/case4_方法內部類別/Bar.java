package com.ocp11.case4_方法內部類別;

public class Bar {
    public void hello(){
        int x = 100;//  在Java 8 之後就可以不用加final
        //x++;
        class Foo{
            void printMe(){
                System.out.println("I am Foo");
                //若要存取hello()外部方法的區域變數
                //則該變數必須是final
                System.out.println(x);
            }
        }
        Foo foo = new Foo();
        foo.printMe();
    }
}
