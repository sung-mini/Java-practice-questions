package com.ohgiraffers.chap05_array.one_dimension.level01_basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        String[] str = {"딸기", "바나나", "복숭아", "키위", "사과"};

        Scanner sc = new Scanner(System.in);

        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        if(num >= 0 && num <= 4) {
            System.out.println(str[num]);
        } else {
            System.out.println("준비된 과일이 없습니다.");
        }
    }
}

