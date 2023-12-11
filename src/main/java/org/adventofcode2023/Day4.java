package org.adventofcode2023;

import java.util.List;

public class Day4 {
    public static Integer totalPoints(List<String> scratchCards) {
        int totalPoints = 0;

        for (String scratchCard : scratchCards) {
            String[] split = scratchCard.split(":");
            String[] numbers = split[1].trim().split("\\|");
            String[] winningNumbers = numbers[0].trim().split(" ");
            String[] numbersYouHave = numbers[1].trim().split(" ");

            int points = 0;

            for (String number : numbersYouHave) {
                for (String winningNumber : winningNumbers) {
                    if (number.trim().equals(winningNumber.trim())) {
                        if (points >= 1) {
                            points = points * 2;
                        } else {
                            points++;
                        }
                    }
                }
            }

            totalPoints += points;
        }

        return totalPoints;
    }
}
