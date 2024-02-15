package com.github.kevinnowak.chp01_building_blocks;

class Chick {

    private String name = "Fluffy";

    {
        System.out.println("setting field");
    }

    Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
