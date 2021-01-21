package com.ocp23_cyclicbarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;


public class Car extends Thread {

    private CyclicBarrier cb;

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.printf("%s從台北出發\n", name);
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("%s到台中了\n", name);
            cb.await(10, TimeUnit.SECONDS);  //等待其他人
            System.out.printf("%s繼續往高雄前進\n", name);
            Thread.sleep(new Random().nextInt(5000));
        } catch (Exception ex) {
            System.out.printf("%s 邊緣人啦 ! %s\n", name, ex.toString());
        }
        System.out.printf("%s 到高雄了\n", name);
    }

    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }

}
