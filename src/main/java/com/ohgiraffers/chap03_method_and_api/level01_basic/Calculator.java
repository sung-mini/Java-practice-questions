package com.ohgiraffers.chap03_method_and_api.level01_basic;

public class Calculator {
    public void checkMethod() {
    }

    public int sum1to10() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public void checkMaxNumber(int i, int i1) {
        int max = (i > i1) ? i : i1;
        System.out.println("두 수 중  큰 수는: " + max + "이다.");
    }

    public int sumTwoNumber(int i, int i1) {
        return i + i1;
    }

    public int minusTwoNumber(int i, int i1) {
        return i - i1;
    }
}

