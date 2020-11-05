package com.ocp2;
//帳戶

public class Account {
    String name;    //戶名
    private int balance;    //餘額

    //存款
    void setBalance(int money) {
        if (money > 0) {
            balance += money;
            System.out.printf("存款%d成功!\n",money);
        }else{
            System.out.printf("存款%d失敗(存款必須大於0)!\n",money);
        }

    }

    //提款
    void withdraw(int money) {
        if (money > 0 && balance >= money) {
            balance -= money;
            System.out.printf("提款%d成功!\n",money);
        }else{
            System.out.printf("提款%d失敗!(提款必須大於0或餘額不足)",money);
        }
    }

    //印出帳戶餘額
    void printBalance() {
        System.out.printf("Name:%s,Balance:%,d\n", name, balance);
    }
}
