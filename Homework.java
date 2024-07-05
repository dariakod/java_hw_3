package com.telran.org.lessonfive;

public class Homework {

    public static void main(String[] args) {

        int a = 15;
        int b = 5;
        int sum = getSum(a, b);
        int sub = getSub(a, b);
        int mult = getMult(a, b);
        int div = getDiv(a, b);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSub(int a, int b) {
        return a - b;
    }

    public static int getMult(int a, int b) {
        return a * b;
    }

    public static int getDiv(int a, int b) {
        return a / b;
    }
}