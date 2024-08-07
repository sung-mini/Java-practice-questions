package com.ohgiraffers.chap03_method_and_api.level02_nomal;

public class Application {
    public static void main(String[] args) {
        RandomMaker randomMaker = new RandomMaker();

        System.out.println(randomMaker.randomNumber(-50, 50));

        System.out.println(randomMaker.randomUpperAlphabet(10));

        System.out.println(randomMaker.rockPaperScissors());

        System.out.println(randomMaker.tossCoin());
    }
}
