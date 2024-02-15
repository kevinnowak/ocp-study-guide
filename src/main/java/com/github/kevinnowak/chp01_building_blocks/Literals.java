package com.github.kevinnowak.chp01_building_blocks;

class Literals {

    public static void main(String[] args) {
        int i = 123;
        long l = 3_000_000_000L;
        float f = 1.2F;
        double d = 1.2;

        int octal = 025;
        int hexa = 0xFAB;
        int binary = 0b101010101;

        System.out.println(l);
        System.out.println(octal);
        System.out.println(hexa);
        System.out.println(binary);
    }
}
