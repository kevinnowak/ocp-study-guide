package com.github.kevinnowak.chp02_operators;

public class Question20 {

    public static void main(String[] args) {
        int myFavoriteNumber = 8;
        int bird = ~myFavoriteNumber;
        int plane = -myFavoriteNumber;
        var superman = bird == plane ? 5 : 10;
        System.out.println(bird + "," + plane + "," + --superman);
    }
}
