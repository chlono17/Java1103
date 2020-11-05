package com.ocp2;

public class TransferTest {
    public static void main(String[] args) {
        Account ac1 = new Account();
        Account ac2 = new Account();
        ac1.name = "John"; ac1.setBalance(10000);
        ac2.name = "Mary"; ac2.setBalance(10000);
        //原本金額
        System.out.println("原本金額");
        ac1.printBalance();
        ac2.printBalance();
        //轉帳
        System.out.println("John轉4000給Mary");
        ac1.transfer(4000, ac2);
        //轉帳後金額
        System.out.println("轉帳後金額");
        ac1.printBalance();
        ac2.printBalance();
    }
}
