package com.ohgiraffers.chap01_literal_and_variable.level02_nomal;

public class Application2 {
    public static void main(String[] args) {
        double a = 80.5; // 국어
        double b = 50.6; // 수학
        double c = 70.8; // 영어

        int sum = (int) (a + b + c);
        int avg = sum / 3;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
