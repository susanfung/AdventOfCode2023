package org.adventofcode2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day7 {
    public static List<String> countAndSortCharacters(String string) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char character : string.toCharArray()) {
            charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
        }

        List<String> sortedCounts = charCountMap.values()
                                            .stream()
                                            .sorted((count1, count2) -> Integer.compare(count2, count1))
                                            .map(String::valueOf)
                                            .collect(java.util.stream.Collectors.toList());
        return sortedCounts;
    }
}
