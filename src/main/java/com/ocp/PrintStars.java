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
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //homework
        for (int i = 1; i <= line+1; i++) {
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
        int m = (int)(Math.ceil(line/2.0));
        for (int i = 1; i < line; i++) {
            for (int j = 1; j < m; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}