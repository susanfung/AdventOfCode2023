package org.adventofcode2023;

public class Day1
{
    public static String findFirstDigit(String string) {
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (Character.isDigit(character)) {
                return String.valueOf(character);
            }
        }

        return null;
    }
}
