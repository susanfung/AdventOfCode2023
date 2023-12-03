package org.adventofcode2023;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Day1 {
    static Logger logger = Logger.getLogger(Day1.class.getName());
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

    static Map<String, String> numberWordsMap = new HashMap<String, String>() {
        {
            put("one", "o1e");
            put("two", "t2o");
            put("three", "t3");
            put("four", "4");
            put("five", "5e");
            put("six", "6");
            put("seven", "7");
            put("eight", "8t");
            put("nine", "9");
        }
    };

    private static String getNumber(Map.Entry<Integer, String> firstDigit,
                                    Map.Entry<Integer, String> firstNumberWord,
                                    boolean firstDigit1) {
        if (firstDigit.getValue() == null || firstNumberWord.getValue() == null) {
            if (firstDigit.getValue() == null) {
                return String.valueOf(numberWordsToDigits(firstNumberWord.getValue()));
            } else {
                return firstDigit.getValue();
            }
        } else if (firstDigit1) {
            return firstDigit.getValue();
        } else {
            return String.valueOf(numberWordsToDigits(firstNumberWord.getValue()));
        }
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

    public static Map.Entry<Integer, String> findFirstNumberWord(String string) {
        Pattern pattern = getPattern();

        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            return new AbstractMap.SimpleEntry<>(matcher.start(), matcher.group());
        } else {
            return new AbstractMap.SimpleEntry<>(-1, null);
        }
    }

    public static Map.Entry<Integer, String> findLastNumberWord(String string) {
        Pattern pattern = getPattern();

        Matcher matcher = pattern.matcher(string);
        String lastMatch = null;
        int lastIndex = -1;

        while (matcher.find()) {
            lastMatch = matcher.group();
            lastIndex = matcher.start();
        }

        return new AbstractMap.SimpleEntry<>(lastIndex, lastMatch);
    }

    private static Pattern getPattern() {
        String[] numbersInWords = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String regex = String.join("|", numbersInWords);
        return Pattern.compile(regex);
    }

    private static int numberWordsToDigits(String numberWord) {
      Map<String, Integer> numberMap = new HashMap<>();
      numberMap.put("zero", 0);
      numberMap.put("one", 1);
      numberMap.put("two", 2);
      numberMap.put("three", 3);
      numberMap.put("four", 4);
      numberMap.put("five", 5);
      numberMap.put("six", 6);
      numberMap.put("seven", 7);
      numberMap.put("eight", 8);
      numberMap.put("nine", 9);

      return numberMap.get(numberWord);
    }
}