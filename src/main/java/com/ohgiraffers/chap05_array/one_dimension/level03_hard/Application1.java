package com.ohgiraffers.chap05_array.one_dimension.level03_hard;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 1) {
            int[] iarr = new int[num];
            int mid = (int)(num / 2 + 1);
            int cnt = 0;

            for(int i = 0; i < mid; i++) {
                iarr[i] = ++cnt;
            }

            for(int i = mid; i < iarr.length; i++) {
                iarr[i] = --cnt;
            }

            for (int j : iarr) {
                System.out.print(j + " ");
            }

        } else {
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }
    }

}

