package com.ocp11.case5_匿名內部類別;

public class Main {

    public static void main(String[] args) {
        Game game = new Game() {
            @Override
            public void play() {
                System.out.println("玩飛機遊戲");
            }
        };
        
        Game game2 = new Game() {
            @Override
            public void play() {
                System.out.println("玩寵物遊戲");
            }
        };
        
        //Java 8 lambda 語法
        Game game3 = () ->System.out.println("玩火車遊戲");
        
        game.play();
        game2.play();
        game3.play();
        
        
    }

}
