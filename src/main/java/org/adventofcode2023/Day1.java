package org.adventofcode2023;

import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static Integer calibrationValuePart2(List<String> stringList) {
        int calibrationValue = 0;

        for (String string : stringList) {
            String firstDigit = findFirstDigit(string);
            String lastDigit = findLastDigit(string);

            if (firstDigit == null){
                firstDigit = "0";
            }

            if (lastDigit == null){
                lastDigit = "0";
            }

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

    public static String findFirstNumberWord(String string) {
        String[] numbersInWords = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String regex = String.join("|", numbersInWords);
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }

    public static String findLastNumberWord(String string) {
        String[] numbersInWords = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String regex = String.join("|", numbersInWords);
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(string);
        String lastMatch = null;

        while (matcher.find()) {
            lastMatch = matcher.group();
        }

        return lastMatch;
    }
}