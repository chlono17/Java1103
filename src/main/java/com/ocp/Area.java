package com.ocp;


public class Area {
    
    int w;
    int h;
    void calcAndPrint() {
        int sum = h*w;
        System.out.println(sum);
    }
    int CalcNotPrint(){
        int sum = w*h;
        return sum;
    }
}
