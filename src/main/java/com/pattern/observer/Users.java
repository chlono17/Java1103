package com.pattern.observer;
//訂閱者(粉絲)
public class Users implements Observer {

    private String name;
    public Users(String name){
        this.name = name;
    }
    @Override
    public void update(String data) {
        System.out.printf("%s 收到資料: %s\n", name, data);
    }
}
