package com.ocp24_executor;

public class LottoMain {

    public static void main(String[] args) {
        
        LottoExecutor exec = new LottoExecutor();
        for (int i = 0; i < 10; i++) {
            exec.execute(new Lotto());
        }
    }

}
