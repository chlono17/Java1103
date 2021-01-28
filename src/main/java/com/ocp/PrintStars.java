package com.ocp;

import java.util.Random;

public class PrintStars {

    public static void main(String[] args) {
        int line = 7;
        /* 利用for
        print: 
                *
                **
                ***
                ****
                *****
         */

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //homework
       
        for (int i = 1; i <= line + 1; i++) {
            for (int j = line; j >= i; j--) {
                System.out.print(" ");
            }
            for (int x = 1; x < i; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //pro ver
        /*
        print:
        *
        **
        ***
        ****
        ***
        **
        *
        
         */
        
        int m = (int) (Math.ceil(line / 2.0));
        int x = 1;
        for (int i = 1; i <= line; i++) {
            if (x <= m) {
                for (int j = 1; j <= m; j++) {
                    for (int k = 1; k <= j; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                    if (x >= m) {
                        for (int k = m-1; k >= 1; k--) {
                            for (int l = 1; l <= k; l++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }
                    x++;
                }
            }
        }
    
    
    }

}
