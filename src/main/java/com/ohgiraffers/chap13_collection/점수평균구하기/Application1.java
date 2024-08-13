package com.ohgiraffers.chap13_collection.점수평균구하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();
        String continueInput;

        do {
            System.out.print("학생 성적 : ");
            int score = scanner.nextInt();
            scores.add(score);

            System.out.print("추가 입력하려면 y : ");
            continueInput = scanner.next().toLowerCase();  // 입력을 소문자로 변환
        } while (continueInput.equals("y"));

        int studentCount = scores.size();

        double averageScore = scores.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("학생 인원 : " + studentCount);
        System.out.println("평균 점수 : " + averageScore);

        scanner.close();
    }
}
