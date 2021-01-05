package com.ocp16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CallStack {
    
    public static void main(String[] args) {
        try {
            calc();
        } catch (FileNotFoundException ex) {
              System.out.println("main方法處理了此問題: " + ex);
        }
    }
    public static void calc() throws FileNotFoundException {
        openFile();
    }
    
    public static void openFile() throws FileNotFoundException {
        File file = new File("src\\main\\java\\com\\ocp16\\nember2.txt");
        Scanner sc = new Scanner(file);
    }
    
}
