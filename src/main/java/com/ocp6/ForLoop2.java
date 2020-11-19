package com.ocp6;

import java.util.Arrays;
import javax.xml.parsers.DocumentBuilder;

public class ForLoop2 {
    public static void main(String[] args) {
        double[][] rows ={
            {170.0,180.5,165.3},
            {60.4,89.5,41.2}
        };
        //enhancd for loop
        for (double row[] : rows) {
            for (double d : row) {
                System.out.println(d);
            }
        }
        //Standard for loop
        for (int i = 0; i < rows.length; i++) {
            for(int j = 0; j < rows[i].length;j++){
                System.out.println(rows[i][j]);
            }
        }
    }
}
