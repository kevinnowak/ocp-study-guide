package com.github.kevinnowak.chp03_making_decisions;

class PatternMatching {

    void compareIntegers1(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.println(data.compareTo(5));
        }
    }

    void compareIntegers2(Number number) {
        if (number instanceof final Integer data) {
            System.out.println(data.compareTo(5));
        }
    }

    void printIntegerGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0) {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        Integer value = 123;

        if (value instanceof Integer) {}

//        if (value instanceof Integer data) {}
    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.println(data.intValue());
    }
}
