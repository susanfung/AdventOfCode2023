package org.adventofcode2023;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day8 {
    public static Integer stepsPart1(String instructions, List<String> nodes) {
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

    public static Integer stepsPart2(String instructions, List<String> nodes) {
        Map<String, List<String>> nodesMap = nodes.stream().collect(Collectors.toMap(
                node -> node.split("=")[0].trim(),
                node -> Arrays.stream(node.split("=")[1].trim().replaceAll("[()]", "").split(","))
                              .map(String::trim)
                              .collect(Collectors.toList())
        ));

        List<String> currentNodes = nodesMap.entrySet().stream()
                                             .map(Map.Entry::getKey)
                                             .filter(key -> key.endsWith("A"))
                                             .collect(Collectors.toList());

        int instructionPosition = 0;
        int steps = 0;

        while (!currentNodes.stream().allMatch(str -> str.endsWith("Z"))) {
            int finalInstructionPosition = instructionPosition;

            currentNodes = currentNodes.stream().map(node -> nodesMap.get(node).get(instructions.charAt(finalInstructionPosition) == 'R' ? 1 : 0))
                                       .collect(Collectors.toList());
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
