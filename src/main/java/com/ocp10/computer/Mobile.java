package com.ocp10.computer;

import java.math.BigInteger;

//      v=因為是抽象類別
public abstract class Mobile implements Computer{

    @Override
    public int add(int x, int y) {
        BigInteger b1 = new BigInteger(x + "");
        BigInteger b2 = new BigInteger(y + "");
        BigInteger sum = b1.add(b2);
        return sum.intValue();
    }
    //抽象類別(半成品)類別 沒有回傳name
    


}
