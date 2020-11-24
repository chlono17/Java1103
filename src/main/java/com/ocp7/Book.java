package com.ocp7;
/*
建立一個物件
=>建立屬性:物件屬性
=>建立方法:{getter / setter
          {toString()
*/
public class Book {
    public static String publishName = "gotop";
    private String name;
    private int price;
    
   public Book() {
       System.out.println("執行Book建構子 1");
   }
   
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
         System.out.println("執行Book建構子 2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "publishname=" + publishName + ", name=" + name + ", price=" + price + '}';
    }

    
    
}
