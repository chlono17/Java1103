package com.ocp14_collection_list_map;

//Vector 是執行緒安全(多人存取安全)的集合

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(81, 5);//空間增到81
                                //^ 每次多出增加多少  
        for (int i = 1; i <= 81; i++) {
            v.add(i);
        }
        v.add(81,100);
        System.out.println("Capacity" + v.capacity());
        System.out.println("Size" + v.size());
        System.out.println(v.get(81));
        System.out.println(v);
    }
}
/*
                HashSet         TreeSet     (不重複)
{新增           
{修改               O
{刪除       

查詢                                O             (O)優勢
--------------------------------------------------------
                LinkedList      Vector      ArrayList
{新增
{修改                O
{刪除

查詢                                              O

{synchronized
{支援多執行緒                        O
{安全                                             (O)優勢
*/
