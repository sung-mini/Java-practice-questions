package com.ohgiraffers.chap11_io;

import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("병합할 파일의 개수 입력 : ");
        int numberOfFiles = scanner.nextInt();
        scanner.nextLine();

        String[] fileNames = new String[numberOfFiles];
        for (int i = 0; i < numberOfFiles; i++) {
            System.out.print((i + 1) + " 번째 파일 이름 입력 : ");
            fileNames[i] = scanner.nextLine();
        }

        System.out.print("병합 될 파일명 입력 : ");
        String destinationFile = scanner.nextLine();

        mergeFiles(fileNames, destinationFile);
    }

    private static void mergeFiles(String[] fileNames, String destinationFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            for (String fileName : fileNames) {
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("오류: 파일을 찾을 수 없습니다. (" + fileName + ")");
                } catch (IOException e) {
                    System.out.println("오류: 파일 읽기 중 문제가 발생했습니다. (" + fileName + ")");
                }
            }
            System.out.println("파일 병합이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("오류: 파일 병합 중 문제가 발생했습니다. (" + destinationFile + ")");
        }
    }
}