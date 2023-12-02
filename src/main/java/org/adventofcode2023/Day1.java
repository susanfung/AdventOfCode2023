package org.adventofcode2023;

import java.util.List;

public class Day1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static Integer calibrationValue(List<String> stringList) {
        int calibrationValue = 0;

        for (String string : stringList) {
            String firstDigit = findFirstDigit(string);
            String lastDigit = findLastDigit(string);

            calibrationValue += Integer.parseInt(firstDigit + lastDigit);
        }

        return calibrationValue;
    }
    public static String findFirstDigit(String string) {
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (Character.isDigit(character)) {
                return String.valueOf(character);
            }
        }

        return null;
    }

    public static String findLastDigit(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            char character = string.charAt(i);
            if (Character.isDigit(character)) {
                return String.valueOf(character);
            }
        }

        return null;
    }
}
