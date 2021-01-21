package com.ocp22_wait_notify;

public class Cookie {
//若要wait/notify 到特定對象使用while() notifyAll 並多設變數來指定
    
    private boolean empty = true;   //盤子的狀態是否為空的
    //吃餅乾

    public synchronized void eat(int no) {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        String name = Thread.currentThread().getName();
        System.out.printf("%s 吃了第 %d 塊餅乾\n", name, no);
        empty = true;
        notifyAll();
    }

    //放餅乾
    public synchronized void put(int no) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        String name = Thread.currentThread().getName();
        System.out.printf("%s 放了第 %d 塊餅乾\n", name, no);
        empty = false;
        notifyAll();

    }

}
