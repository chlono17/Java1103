package com.ocp12.lambda3;

public class Main {
    public static void main(String[] args) {
        int score = 65;
        Pass schoolPass = (x) -> x >=60;
        Pass javaPass = (x) -> x >=70;
        
        checkScore(score, javaPass);
        checkScore(score, schoolPass);
        
        int foodscore = 1;
        checkScore(foodscore, (x) -> x ==100);
    }
    
    public static void checkScore(int x,Pass p) {
        System.out.printf("%d 的判斷結果=> %b\n",x, p.check(x));
    }
}
