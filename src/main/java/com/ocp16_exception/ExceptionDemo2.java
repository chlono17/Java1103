package com.ocp16_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

    public static void main(String[] args) {
        play();
    }

    public static void play() {
        int x = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("假設分子(x)是 10 請輸入分母: ");
        try {
            int y = sc.nextInt();   //可能會發生 InputMismatchException 的例外
            //先判斷 y 是否 = 0 ?
            if (y != 0) {//避免運算不必要的程式,而直接做判斷
                int result = x / y;
            System.out.println(result);
            }else{
                System.out.println("分母不可 = 0,請重新輸入");
                play();
            }
        } catch (InputMismatchException e) {
            System.out.print("輸入類型與預期不同, 請輸入數字");
            System.out.println("錯誤類型: " + e);
            System.out.println("錯誤原因: " + e.getMessage());
            play();
        }finally{
            System.out.println("結束");
        }

    }

}
