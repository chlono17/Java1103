package com.ocp4;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int[] ans = RandomNumber.getRandomNumber(4);
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入四位數=>");
            String input = sc.next();
            int[] guess = {input.charAt(0) - 48, input.charAt(1) - 48, input.charAt(2) - 48, input.charAt(3) - 48};
            //先比B(數字相同)
            int b = 0;
            for (int i = 0; i < guess.length; i++) {
                for (int j = 0; j < ans.length; j++) {
                    if (guess[i] == ans[j]) {
                        b++;
                    }
                }
            }
            //再比A(位置相同,數字相同)
            int a = 0;
            for (int i = 0; i < guess.length; i++) {
                if (guess[i] == ans[i]) {
                    a++;
                }
            }
            b = b - a;
            System.out.printf("%s:%dA%dB\n", Arrays.toString(guess), a, b);
            if (a == 4) {
                System.out.println("恭喜答對~");
                break;
            }
            int[] computer_guess = RandomNumber.getRandomNumber(4);
            int c_b = 0;
            for (int i = 0; i < computer_guess.length; i++) {
                for (int j = 0; j < ans.length; j++) {
                    if (computer_guess[i] == ans[j]) {
                        c_b++;
                    }
                }
            }
        } while (true);
    }
}
