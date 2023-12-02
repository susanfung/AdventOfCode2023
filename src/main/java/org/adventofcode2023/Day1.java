package org.adventofcode2023;

import java.util.List;
import java.util.logging.Logger;

public class Day1 {
    static Logger logger = Logger.getLogger(Day1.class.getName());
    public static void main(String[] args) {
        logger.info("Hello World");
    }

    public static Integer calibrationValuePart1(List<String> stringList) {
        int calibrationValue = 0;

        for (String string : stringList) {
            calibrationValue += Integer.parseInt(findFirstDigit(string) + findLastDigit(string));
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

enum Number {
    ONE(1, "one"),
    TWO(2, "two"),
    THREE(3, "three"),
    FOUR(4, "four"),
    FIVE(5, "five"),
    SIX(6, "six"),
    SEVEN(7, "seven"),
    EIGHT(8, "eight"),
    NINE(9, "nine");

    private final int value;
    private final String word;

    Number(int value, String word) {
        this.value = value;
        this.word = word;
    }

    public int getValue() {
        return this.value;
    }

    public String getWord() {
        return this.word;
    }
}