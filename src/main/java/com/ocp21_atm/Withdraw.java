package com.ocp21_atm;

public class Withdraw implements Runnable{
    private Account account;
    private int x;

    public Withdraw(Account account, int x) {
        this.account = account;
        this.x = x;
    }


    @Override
    public void run() {
        //去執行提款邏輯
        
        account.withdraw(x);
    }
    
}
