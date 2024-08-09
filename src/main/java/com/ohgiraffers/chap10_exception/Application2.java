package com.ohgiraffers.chap10_exception;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        String birthdateInput = scanner.nextLine();

        try {
            LocalDate birthdate = LocalDate.parse(birthdateInput /*, formatter */);
            checkAge(birthdate);
            System.out.println("입장하셔도 됩니다.");
        } catch (DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
    private static void checkAge(LocalDate birthdate) throws InvalidAgeException {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - birthdate.getYear();
        if (birthdate.plusYears(age).isAfter(today)) {
            age--;
        }
//        int age = Period.between(birthdate, today).getYears();
        if (age < 20) {
            throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
        }
    }
}

