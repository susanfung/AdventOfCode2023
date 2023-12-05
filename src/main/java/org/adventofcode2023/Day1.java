package org.adventofcode2023;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Day1 {
    static Logger logger = Logger.getLogger(Day1.class.getName());
    private static final Map<String, String> numberWordsMap = new HashMap<String, String>() {
        {
            put("one", "o1e");
            put("two", "t2o");
            put("three", "t3ree");
            put("four", "f4ur");
            put("five", "f5ve");
            put("six", "s6x");
            put("seven", "s7ven");
            put("eight", "e8ght");
            put("nine", "n9ne");
        }
    };

    public static void main(String[] args) {
        logger.info("Hello World");
    }

    public static Integer calibrationValuePart1(List<String> stringList) {
        int calibrationValue = 0;

        for (String string : stringList) {
            calibrationValue += Integer.parseInt(findFirstDigit(string).getValue() + findLastDigit(string).getValue());
        }

        return calibrationValue;
    }

    public static Integer calibrationValuePart2(List<String> stringList) {
        List<String> replacedWordsList = replaceWordsWithNumbers(stringList);

        return calibrationValuePart1(replacedWordsList);
    }

    public static List<String> replaceWordsWithNumbers(List<String> wordsList) {
        return wordsList.stream()
                        .map(word -> {
                            for (String key : numberWordsMap.keySet()) {
                                word = word.replaceAll(Pattern.quote(key), numberWordsMap.get(key));
                            }
                            return word;
                        })
                        .collect(Collectors.toList());
    }

    public static Map.Entry<Integer, String> findFirstDigit(String string) {
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (Character.isDigit(character)) {
                return new SimpleEntry<>(i, String.valueOf(character));
            }
        }

        return new SimpleEntry<>(-1, null);
    }

    public static Map.Entry<Integer, String> findLastDigit(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            char character = string.charAt(i);

            if (Character.isDigit(character)) {
                return new SimpleEntry<>(i, String.valueOf(character));
            }
        }

        return new SimpleEntry<>(-1, null);
    }
}