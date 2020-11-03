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
        
        
        for (int i =1; i <= line; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
               
            }
            
            System.out.println("");
        }
    }
    
}
