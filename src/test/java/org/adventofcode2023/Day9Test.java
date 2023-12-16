package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day9Test {
    @Test
    void sumOfExtrapolatedValues() {
        List<String> history = Arrays.asList("0 3 6 9 12 15", "1 3 6 10 15 21", "10 13 16 21 30 45");
        Approvals.verify(Day9.sumOfExtrapolatedValues(history));
    }
}