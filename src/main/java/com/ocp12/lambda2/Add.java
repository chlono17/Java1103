package com.ocp12.lambda2;
/*
fucntionalinterface 1.只有一個方法
                    2.除了
                        2.1default方法
                        2.2公用方法
                           {object裡所定的方法
*/
@FunctionalInterface
public interface Add {
    int sum(int x ,int y);
    public int hashCode();//公用方法
    default void copyright(){//default 有實作的方法
    }
   
}
