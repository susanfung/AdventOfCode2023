package org.adventofcode2023;

import java.util.List;

public class Day15 {
    public static Integer sumOfInitializationSequence(List<String> initializationSequence) {
        int sum = 0;

        for (String string : initializationSequence) {
            sum += hashAlgorithm(string);
        }

        return sum;
    }

    public static Integer hashAlgorithm(String string) {
        int result = 0;

        for (int i = 0; i < string.length(); i++) {
            result += (int) string.charAt(i);
            result *= 17;
            result = result % 256;
        }

        return result;
    }
}
