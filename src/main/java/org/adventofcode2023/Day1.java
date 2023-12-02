package org.adventofcode2023;

public class Day1 {
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
