package org.adventofcode2023;

import java.util.ArrayList;
import java.util.List;

public class Day9 {
    public static Integer sumOfExtrapolatedValuesForward(List<String> history) {
        int sum = 0;

        for (String line : history) {
            String[] splitLine = line.split(" ");
            List<Integer> numbers = new ArrayList<>();
            List<Integer> lastNumbers = new ArrayList<>();
            boolean allZeros = false;
            int sumLastNumbers = 0;

            for (int i = 0; i < splitLine.length; i++) {
                numbers.add(Integer.valueOf(splitLine[i]));
            }

            while (!allZeros) {
                List<Integer> oldNumbers = numbers;
                List<Integer> newNumbers = new ArrayList<>();

                lastNumbers.add(oldNumbers.get(oldNumbers.size() - 1));

                for (int i = 0; i < oldNumbers.size() - 1; i++) {
                    newNumbers.add(oldNumbers.get(i + 1) - oldNumbers.get(i));
                }

                for (Integer number : newNumbers) {
                    if (number != 0) {
                        allZeros = false;
                        break;
                    } else {
                        allZeros = true;
                    }
                }

                numbers = newNumbers;
            }

            for (Integer number : lastNumbers) {
                sumLastNumbers += number;
            }

            sum += sumLastNumbers;
        }

        return sum;
    }

    public static Integer sumOfExtrapolatedValuesBackward(List<String> history) {
        int sum = 0;

        for (String line : history) {
            String[] splitLine = line.split(" ");
            List<Integer> numbers = new ArrayList<>();
            List<Integer> firstNumbers = new ArrayList<>();
            boolean allZeros = false;
            int sumFirstNumbers = 0;

            for (int i = 0; i < splitLine.length; i++) {
                numbers.add(Integer.valueOf(splitLine[i]));
            }

            while (!allZeros) {
                List<Integer> oldNumbers = numbers;
                List<Integer> newNumbers = new ArrayList<>();

                firstNumbers.add(oldNumbers.get(0));

                for (int i = 0; i < oldNumbers.size() - 1; i++) {
                    newNumbers.add(oldNumbers.get(i + 1) - oldNumbers.get(i));
                }

                for (Integer number : newNumbers) {
                    if (number != 0) {
                        allZeros = false;
                        break;
                    } else {
                        allZeros = true;
                    }
                }

                numbers = newNumbers;
            }

            for (int i = firstNumbers.size() - 1; i >= 0; i--) {
                sumFirstNumbers = firstNumbers.get(i) - sumFirstNumbers;
            }

            sum += sumFirstNumbers;
        }

        return sum;
    }
}
