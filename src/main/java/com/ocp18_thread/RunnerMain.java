package com.ocp18_thread;

public class RunnerMain {
    public static void main(String[] args) {
        Runner r1 = new Runner();
        Runner r2 = new Runner();
        r1.setName("烏龜");
        r2.setName("兔子");
        r2.setDaemon(true);//主程式跑完便結束
        //背景執行緒(設定開啟)
        r1.setPriority(Thread.MAX_PRIORITY);
        r2.setPriority(8);//可放常數 1 ~ 10
        r1.start();     //啟動執行緒
        r2.start();     //啟動執行緒
    }
}
