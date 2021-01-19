package com.ocp21_atm;

public class ATM {
    public static void main(String[] args) {
        //帳戶(資源)
        Account account = new Account(10_0000);
        //任務(工作)
        Withdraw w1 = new Withdraw(account, 5_0000);//提5,0000
        Withdraw w2 = new Withdraw(account, 3_0000);//提3,0000
        Withdraw w3 = new Withdraw(account, 4_0000);//提4,0000
        //分配工作(工作)
        Thread t1 = new Thread(w1, "小明");
        Thread t2 = new Thread(w2, "小華");
        Thread t3 = new Thread(w3, "小英");
        t1.start();
        t2.start();
        t3.start();
    }
    
}
