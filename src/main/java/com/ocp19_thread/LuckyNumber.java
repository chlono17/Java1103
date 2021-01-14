package com.ocp19_thread;

public class LuckyNumber extends Thread{//專責執行緒
    private static final int LUCKY_NUMBER = 777;

    @Override
    public void run() {
        for (int i= 1;true ; i++) {
             String name = Thread.currentThread().getName();
            int number = (int)(Math.random() * 1000);   // Math.random() 取0~1之間浮點數
            if (number == LUCKY_NUMBER){
                 System.out.printf(" %s 總共取了 %d 次才得到 %d \n",name , i, LUCKY_NUMBER);
                 break;
            }
        }
    }

   
}
