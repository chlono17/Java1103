package com.ocp22_wait_notify;

public class Eat implements Runnable{
    private Cookie cookie;

    //吃餅乾的工作
    public Eat(Cookie cookie) {
        this.cookie = cookie;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            cookie.eat(i);
        }
    }
    
}
