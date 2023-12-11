package org.adventofcode2023;

import java.util.Arrays;
import java.util.List;

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
}
