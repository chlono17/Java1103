package com.ocp2;



public class Bank {
    public static void main(String[] args) {
        Account ac1 = new Account();
        Account ac2 = new Account();
        
        ac1.name = "John";
        ac1.setBalance(10000);
        ac1.setBalance(5000);
        ac1.withdraw(900);
        ac2.name = "Mary";
        ac2.setBalance(10000);
        ac2.setBalance(3000);
        
        ac1.printBalance();
        //System.out.printf("Name: %s,Balance:%,d",ac1.name,ac1.balance);
        ac2.printBalance();
        //System.out.printf("Name: %s,Balance:%,d",ac2.name,ac2.balance);        
        

    }
}
