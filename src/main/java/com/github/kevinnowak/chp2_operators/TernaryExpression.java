package com.github.kevinnowak.chp2_operators;

class TernaryExpression {

    public static void main(String[] args) {
        int i = 2;

        var v = i < 2 ? "String" : 2.0;
    }

    static void test(int i) {
        var tmp = i < 2 ? "String" : 2.0;
    }
}
