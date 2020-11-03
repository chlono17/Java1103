package com.ocp;

public class PrintStars {

    public static void main(String[] args) {
        int line = 7;
        /*利用for
        print:  *
                **
                ***
                ****
                *****
         */

        for (int i = 1; i <= line; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");

            }
            for (int x = 1; x < i; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
