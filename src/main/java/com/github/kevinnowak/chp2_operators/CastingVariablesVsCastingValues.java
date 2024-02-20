package com.github.kevinnowak.chp2_operators;

class CastingVariablesVsCastingValues {

    public static void main(String[] args) {
        byte hat = 1;
        byte gloves = 7 * 10;
        short scarf = 5;
//        short boots = 2 + 1;
//        short boots = 2 + hat;
        short boots = (short) (2 + hat);
//        byte noGloves = 7 * 100;

        long goat = 10;
        int sheep = 5;
//        sheep = sheep * goat;
        sheep *= goat;
    }
}
