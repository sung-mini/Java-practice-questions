package com.ohgiraffers.chap13_collection.학생ID관리;

import java.util.*;

public class Application4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> idSet = new HashSet<>();
        List<String> idList = new LinkedList<>();
        String id;

        while (true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            id = scanner.nextLine();

            if (id.equalsIgnoreCase("exit")) {
                break;
            }
            if (idSet.contains(id)) {
                System.out.println("이미 등록 된 ID입니다.");
            } else {
                idSet.add(id);
                idList.add(id);
                System.out.println("ID가 추가 되었습니다.");
            }
        }
        Collections.reverse(idList);
        System.out.println("모든 학생의 ID : " + idList);

        scanner.close();
    }
}
