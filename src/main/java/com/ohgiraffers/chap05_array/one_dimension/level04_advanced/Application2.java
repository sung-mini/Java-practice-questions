package com.ohgiraffers.chap05_array.one_dimension.level04_advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] iarr = new int[4];
        int[] input = new int[4];
        int sCount;
        int bCount;
        int countDown = 10;

        for(int i = 0; i < iarr.length; i++) {
            iarr[i] = rand.nextInt(10);
            for(int j = 0; j < i; j++) {
                if(iarr[i] == iarr[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int k : iarr) {
            System.out.print(k + " ");
        }
        System.out.println();

        while(countDown > 0) {
            sCount = 0;
            bCount = 0;
            System.out.println(countDown + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요 : ");
            String str = sc.nextLine();

            if(str.length() != 4) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }

            countDown--;

            for(int i = 0; i < input.length; i++) {
                input[i] = str.charAt(i) - '0';
                if(iarr[i] == input[i]) sCount++;

            }

            for(int i = 0; i < iarr.length; i++) {
                for(int j = 0; j < iarr.length; j++) {
                    if(input[i] != iarr[i] && iarr[i] == input[j]) {
                        bCount++;
                    }
                }
            }

            if(sCount == 4) {
                System.out.println("정답입니다.");
                return;
            }

            System.out.println("아쉽네요 " + sCount + "S " + bCount + "B 입니다.");

        }

        System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");

    }

}

