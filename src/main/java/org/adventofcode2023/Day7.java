package org.adventofcode2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day7 {
    public static Integer totalWinningsPart1(List<String> cardsAndBids) {
        List<Day7Hands> hands = new ArrayList<>();
        int totalWinnings = 0;

        for (String cardsAndBid : cardsAndBids) {
            String[] cardsAndBidArray = cardsAndBid.split(" ");
            Integer characterCounts = getScorePart1(cardsAndBidArray[0]);

            hands.add(new Day7Hands(characterCounts, cardsAndBidArray[0], cardsAndBidArray[1]));
        }

        Collections.sort(hands, (hand1, hand2) -> {
            if (hand1.characterCounts.equals(hand2.characterCounts)) {
                List<String> hand1Cards = cardsToNumbersPart1(hand1.cards.split(""));
                List<String> hand2Cards = cardsToNumbersPart1(hand2.cards.split(""));

                for (int j = 0; j < hand1Cards.size(); j++) {
                    int comparisonCards = Integer.compare(Integer.parseInt(hand1Cards.get(j)), Integer.parseInt(hand2Cards.get(j)));

                    if (comparisonCards != 0) {
                        return comparisonCards;
                    }
                }
            } else {
                int comparisonCharacterCounts = hand1.characterCounts.compareTo(hand2.characterCounts);

                if (comparisonCharacterCounts != 0) {
                    return comparisonCharacterCounts;
                }
            }

            return 0;
        });

        for (int i = 0; i < hands.size(); i++) {
            totalWinnings += Integer.parseInt(hands.get(i).bid) * (i + 1);
        }

        return totalWinnings;
    }

    public static Integer getScorePart1(String string) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char character : string.toCharArray()) {
            charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
        }

        List<String> sortedCounts = charCountMap.values()
                                                .stream()
                                                .sorted((count1, count2) -> Integer.compare(count2, count1))
                                                .map(String::valueOf)
                                                .collect(java.util.stream.Collectors.toList());

        return calculateScore(sortedCounts);
    }

    private static int calculateScore(List<String> cards) {
        if (String.join("", cards).equals("5")) {
            return 7;
        } else if (String.join("", cards).equals("41")) {
            return 6;
        } else if (String.join("", cards).equals("32")) {
            return 5;
        } else if (String.join("", cards).equals("311")) {
            return 4;
        } else if (String.join("", cards).equals("221")) {
            return 3;
        } else if (String.join("", cards).equals("2111")) {
            return 2;
        } else if (String.join("", cards).equals("11111")) {
            return 1;
        } else {
            return 0;
        }
    }

    private static List<String> cardsToNumbersPart1(String[] cards) {
        for (int j = 0; j < cards.length; j++) {
            switch (cards[j]) {
                case "T":
                    cards[j] = "10";
                    break;
                case "J":
                    cards[j] = "11";
                    break;
                case "Q":
                    cards[j] = "12";
                    break;
                case "K":
                    cards[j] = "13";
                    break;
                case "A":
                    cards[j] = "14";
                    break;
            }
        }

        return Arrays.asList(cards);
    }

    public static Integer getScorePart2(String string) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char character : string.toCharArray()) {
            charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
        }

        Map<Integer, Integer> transformedMap = transformKeys(charCountMap);

        if (charCountMap.containsKey('J')) {
            Integer largestKey = null;
            int largestValue = Integer.MIN_VALUE;

            for (Map.Entry<Integer, Integer> entry : transformedMap.entrySet()) {
                int value = entry.getValue();

                if (value > largestValue || (value == largestValue && entry.getKey() > largestKey)) {
                    largestKey = entry.getKey();
                    largestValue = value;
                }
            }

            transformedMap.put(largestKey, transformedMap.get(largestKey) + transformedMap.get(1));
            transformedMap.remove(1);
        }

        List<String> sortedCounts = transformedMap.values()
                                                  .stream()
                                                  .sorted((count1, count2) -> Integer.compare(count2, count1))
                                                  .map(String::valueOf)
                                                  .collect(java.util.stream.Collectors.toList());

        return calculateScore(sortedCounts);
    }

    private static Map<Integer, Integer> transformKeys(Map<Character, Integer> charCountMap) {
        Map<Integer, Integer> transformedMap = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char originalKey = entry.getKey();
            int value = entry.getValue();

            int transformedKey = Integer.parseInt(cardsToNumbersPart2(new String[]{String.valueOf(originalKey)}).get(0));

            transformedMap.put(transformedKey, value);
        }

        return transformedMap;
    }

    private static List<String> cardsToNumbersPart2(String[] cards) {
        for (int j = 0; j < cards.length; j++) {
            switch (cards[j]) {
                case "T":
                    cards[j] = "10";
                    break;
                case "J":
                    cards[j] = "1";
                    break;
                case "Q":
                    cards[j] = "12";
                    break;
                case "K":
                    cards[j] = "13";
                    break;
                case "A":
                    cards[j] = "14";
                    break;
            }
        }

        return Arrays.asList(cards);
    }

}
