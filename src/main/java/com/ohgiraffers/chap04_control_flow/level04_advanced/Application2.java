package com.ohgiraffers.chap04_control_flow.level04_advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("월 급여 입력 : ");
        int salary = sc.nextInt() ;

        System.out.print("월 매출액 입력 : ");
        int income = sc.nextInt();

        double bonusRate = 0.0;
        int totalSalary = 0;

        if(income >= 50000000) {
            bonusRate = 0.05;
        } else if(income >= 30000000) {
            bonusRate = 0.03;
        } else if(income >= 10000000) {
            bonusRate = 0.01;
        } else {
            bonusRate = 0;
        }

        totalSalary = salary + (int)(income * bonusRate);
        System.out.println("======================");
        System.out.println("매출액 : " + income);
        System.out.println("보너율 : " + (int)(bonusRate * 100) + "%");
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + (int)(bonusRate * income));
        System.out.println("======================");
        System.out.println("총 급여 : " + totalSalary);
    }
}

