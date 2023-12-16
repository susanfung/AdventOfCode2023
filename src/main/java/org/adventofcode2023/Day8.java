package org.adventofcode2023;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day8 {
    public static Integer steps(String instructions, List<String> nodes) {
        Map<String, List<String>> nodesMap = nodes.stream().collect(Collectors.toMap(
                node -> node.split("=")[0].trim(),
                node -> Arrays.stream(node.split("=")[1].trim().replaceAll("[()]", "").split(","))
                              .map(String::trim)
                              .collect(Collectors.toList())
        ));

        String node = "AAA";
        int instructionPosition = 0;
        int steps = 0;

        while (!node.equals("ZZZ")) {
            node = nodesMap.get(node).get(instructions.charAt(instructionPosition) == 'R' ? 1 : 0);
            steps++;

            if (instructionPosition == instructions.length() - 1) {
                instructionPosition = 0;
            } else {
                instructionPosition++;
            }
        }

        return steps;
    }
}
