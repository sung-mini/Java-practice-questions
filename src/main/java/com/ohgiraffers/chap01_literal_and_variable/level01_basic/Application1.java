package com.ohgiraffers.chap01_literal_and_variable.level01_basic;

public class Application1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        int plus = a + b;
        int minus = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("더하기 결과 : " + plus);
        System.out.println("빼기 결과 : " + minus);
        System.out.println("곱하기 결과 : " + multi);
        System.out.println("나누기한 몫 : " + div);
        System.out.println("나누기한 나머지 : " + mod);
    }
}

