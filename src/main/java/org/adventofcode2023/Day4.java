package org.adventofcode2023;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day4 {
    public static Integer totalPoints(List<String> scratchCards) {
        int totalPoints = 0;

        for (String scratchCard : scratchCards) {
            String[] split = scratchCard.split(":");
            String[] numbers = split[1].trim().split("\\|");
            List<String> winningNumbers = Arrays.asList(numbers[0].trim().split("\\s+"));
            String[] cardNumbers = numbers[1].trim().split("\\s+");

            int points = 0;

            for (String number : cardNumbers) {
                if (winningNumbers.contains(number)) {
                    points = points == 0 ? 1 : points * 2;
                }
            }

            totalPoints += points;
        }

        return totalPoints;
    }

    public static Integer totalScratchCards(List<String> scratchCards) {
        Map<Integer, Integer> cardMap = generateScratchcardHashMaps(scratchCards);

        for (String scratchCard : scratchCards) {
            String[] split = scratchCard.split(":");
            String[] numbers = split[1].trim().split("\\|");
            List<String> winningNumbers = Arrays.asList(numbers[0].trim().split("\\s+"));
            String[] cardNumbers = numbers[1].trim().split("\\s+");

            int points = 0;
            int cardNumber = Integer.parseInt(split[0].trim().split("\\s+")[1]);
            int numberOfCards = cardMap.get(cardNumber);

            for (String number : cardNumbers) {
                if (winningNumbers.contains(number)) {
                    points += 1;
                }
            }

            for (int i = 1; i <= points; i++) {
                cardMap.put(cardNumber + i, cardMap.get(cardNumber + i) + numberOfCards);
            }
        }

        return sumOfScratchcardValues(cardMap);
    }

    public static Map<Integer, Integer> generateScratchcardHashMaps(List<String> scratchCards) {
        Map<Integer, Integer> cardMap = new HashMap<>();

        for (int i = 1; i <= scratchCards.size(); i++) {
            cardMap.put(i, 1);
        }

        return cardMap;
    }

    public static int sumOfScratchcardValues(Map<Integer, Integer> cardMap) {
        int total = 0;

        for (int value : cardMap.values()) {
            total += value;
        }

        return total;
    }
}
