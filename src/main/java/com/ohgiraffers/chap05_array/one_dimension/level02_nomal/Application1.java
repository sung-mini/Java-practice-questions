package com.ohgiraffers.chap05_array.one_dimension.level02_nomal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 하나 입력하세요 : ");
        String str = sc.nextLine();

        System.out.print("검색할 문자를 입력하세요 : ");
        char c = sc.next().charAt(0);

        int count = 0;

        char[] carr = str.toCharArray();

        for (char value : carr) {
            if (value == c) count++;
        }
        System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + c + "는 " + count + "개 입니다.");
    }
}


