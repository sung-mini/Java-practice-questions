package com.ohgiraffers.chap13_collection.최근방문한URL기록;

import java.util.LinkedList;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> recentUrls = new LinkedList<>();
        String url;

        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            url = scanner.nextLine();

            if (url.equalsIgnoreCase("exit")) {
                break;
            }
            recentUrls.addFirst(url);

            System.out.println("최근 방문 url : " + recentUrls);
        }
        scanner.close();
    }
}

