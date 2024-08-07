package com.ohgiraffers.chap04_control_flow.level02_nomal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = 0.0;
        double weight = 0.0;
        String result = "";

        System.out.print("키(cm) 입력: ");
        height = scanner.nextDouble();
        System.out.print("몸무게(kg) 입력: ");
        weight = scanner.nextDouble();

        // 키를 미터로 변환
        double heightM = height / 100;

        // BMI 계산
        double bmi = weight / (heightM * heightM);

        // BMI에 따른 결과 결정
        if (bmi < 20) {
            result = "저체중";
        } else if (bmi < 25) {
            result = "정상체중";
        } else if (bmi < 30) {
            result = "과체중";
        } else {
            result = "비만";
        }

        System.out.println("당신은 " + result + " 입니다.");
    }
}


