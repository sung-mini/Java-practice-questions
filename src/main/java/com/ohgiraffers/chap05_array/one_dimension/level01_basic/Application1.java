package com.ohgiraffers.chap05_array.one_dimension.level01_basic;

public class Application1 {
    public static void main(String[] args) {
        int[] iarr = new int[10];

        for (int i = 0; i < iarr.length; i++) {
            iarr[i] = i + 1;
        }

        for (int num : iarr) {
            System.out.print(num + " ");
        }
    }
}
