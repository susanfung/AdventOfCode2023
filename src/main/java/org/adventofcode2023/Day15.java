package org.adventofcode2023;

public class Day15 {
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
