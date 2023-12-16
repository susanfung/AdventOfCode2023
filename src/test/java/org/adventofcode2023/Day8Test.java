package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day8Test {
    @Test
    void stepsExample1() {
        String instructions = "RL";
        List<String> nodes = Arrays.asList("AAA = (BBB, CCC)", "BBB = (DDD, EEE)", "CCC = (ZZZ, GGG)", "DDD = (DDD, DDD)",
                                           "EEE = (EEE, EEE)", "GGG = (GGG, GGG)", "ZZZ = (ZZZ, ZZZ)");
        Approvals.verify(Day8.steps(instructions, nodes));
    }

    @Test
    void stepsExample2() {
        String instructions = "LLR";
        List<String> nodes = Arrays.asList("AAA = (BBB, BBB)", "BBB = (AAA, ZZZ)", "ZZZ = (ZZZ, ZZZ)");
        Approvals.verify(Day8.steps(instructions, nodes));
    }
}