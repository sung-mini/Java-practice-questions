package com.ohgiraffers.chap03_method_and_api.level02_nomal;

import java.util.Random;

public class RandomMaker {
    public int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public String randomUpperAlphabet(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) ('A' + random.nextInt(26)));
        }
        return sb.toString();
    }

    public String rockPaperScissors() {
        String[] options = {"가위", "바위", "보"};
        Random random = new Random();
        return options[random.nextInt(3)];
    }

    public String tossCoin() {
        String[] sides = {"앞면", "뒷면"};
        Random random = new Random();
        return sides[random.nextInt(2)];
    }
}

