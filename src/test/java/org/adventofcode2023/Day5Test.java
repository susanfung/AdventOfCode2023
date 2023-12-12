package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day5Test {
    @Test
    void createMap() {
        List<String> seedToSoilMap = Arrays.asList("50 98 2", "52 50 48");
        Approvals.verify(Day5.createMap(seedToSoilMap));
    }
}