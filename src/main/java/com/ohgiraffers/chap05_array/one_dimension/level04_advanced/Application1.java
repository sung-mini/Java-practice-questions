package com.ohgiraffers.chap05_array.one_dimension.level04_advanced;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
    }
}

