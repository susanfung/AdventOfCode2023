package org.adventofcode2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day7 {
    public static Integer totalWinnings(List<String> cardsAndBids) {
        List<Day7Hands> hands = new ArrayList<>();
        int totalWinnings = 0;

        for (String cardsAndBid : cardsAndBids) {
            String[] cardsAndBidArray = cardsAndBid.split(" ");
            Integer characterCounts = getScore(cardsAndBidArray[0]);

            hands.add(new Day7Hands(characterCounts, cardsAndBidArray[0], cardsAndBidArray[1]));
        }

        Collections.sort(hands, (hand1, hand2) -> {
            if (hand1.characterCounts.equals(hand2.characterCounts)) {
                List<String> hand1Cards = cardsToNumbers(hand1.cards.split(""));
                List<String> hand2Cards = cardsToNumbers(hand2.cards.split(""));

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

    public static Integer getScore(String string) {
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

    private static List<String> cardsToNumbers(String[] cards) {
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
}
