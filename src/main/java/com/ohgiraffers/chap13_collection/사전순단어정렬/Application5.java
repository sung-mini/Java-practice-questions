package com.ohgiraffers.chap13_collection.사전순단어정렬;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String word = scanner.nextLine();
            if(word.equals("exit")) break;
            words.add(word);
        }

        System.out.println("정렬 된 단어 : " + words);
    }
}
