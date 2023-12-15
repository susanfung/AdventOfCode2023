package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day6Test {
    @Test
    void answerDay6Part1() {
        List<Integer> times = Arrays.asList(55, 99, 97, 93);
        List<Integer> distances = Arrays.asList(401, 1485, 2274, 1405);
        Approvals.verify(Day6.multipleOfNumberOfWaysToBeatRecord(times, distances));
    }

    @Test
    void multipleOfNumberOfWaysToBeatRecord() {
        List<Integer> times = Arrays.asList(7, 15, 30);
        List<Integer> distances = Arrays.asList(9, 40, 200);
        Approvals.verify(Day6.multipleOfNumberOfWaysToBeatRecord(times, distances));
    }
}