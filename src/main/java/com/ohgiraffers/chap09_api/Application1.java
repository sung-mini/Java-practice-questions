package com.ohgiraffers.chap09_api;

public class Application1 {
    public static void main(String[] args) {
        String original = "i will be a good developer";
        String capitalized = capitalizeEachWord(original);
        System.out.println(capitalized); 
        System.out.println("변환된 문자열 : " + capitalized.toUpperCase());
        System.out.println("총 단어 개수 : " + countWords(original));
    }
    public static String capitalizeEachWord(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] words = str.split("\\s+");
        StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {

                capitalizedString.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return capitalizedString.toString().trim();
    }
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }
}

