package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day6Test {
    @Test
    void multipleOfNumberOfWaysToBeatRecord() {
        List<Integer> times = Arrays.asList(7, 15, 30);
        List<Integer> distances = Arrays.asList(9, 40, 200);
        Approvals.verify(Day6.multipleOfNumberOfWaysToBeatRecord(times, distances));
    }
}