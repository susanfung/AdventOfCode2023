package org.adventofcode2023;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day5 {
    public static Map<Integer, Integer> createMap(List<String> stringList) {
        Map<Integer, Integer> map = new HashMap<>();

        for (String string : stringList) {
            String[] split = string.split(" ");

            int destinationRangeStart = Integer.parseInt(split[0]);
            int sourceRangeStart = Integer.parseInt(split[1]);
            int range = Integer.parseInt(split[2]);

            for (int i = sourceRangeStart, j = destinationRangeStart; i < sourceRangeStart + range && j < destinationRangeStart + range; i++, j++) {
                map.put(i, j);
            }
        }

        return map;
    }
}
