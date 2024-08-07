package com.ohgiraffers.chap03_method_and_api.level01_basic;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.checkMethod();

        int sum1to10 = calculator.sum1to10();
        System.out.println("1부터 10까지의 합 : " + sum1to10);

        calculator.checkMaxNumber(10, 20);

        int sum = calculator.sumTwoNumber(10, 20);
        System.out.println("10과 20의 합은 : " + sum);

        int difference = calculator.minusTwoNumber(10, 5);
        System.out.println("10과 5의 차는 : " + difference);
    }
}


