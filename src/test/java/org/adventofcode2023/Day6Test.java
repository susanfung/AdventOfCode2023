package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day6Test {
    @Test
    void answerDay6Part1() {
        List<Integer> times = Arrays.asList(55, 99, 97, 93);
        List<Long> distances = Arrays.asList(401L, 1485L, 2274L, 1405L);
        Approvals.verify(Day6.multipleOfNumberOfWaysToBeatRecord(times, distances));
    }

    @Test
    void answerDay6Part2() {
        List<Integer> times = Arrays.asList(55999793);
        List<Long> distances = Arrays.asList(401148522741405L);
        Approvals.verify(Day6.multipleOfNumberOfWaysToBeatRecord(times, distances));
    }

    @Test
    void multipleOfNumberOfWaysToBeatRecordPart1() {
        List<Integer> times = Arrays.asList(7, 15, 30);
        List<Long> distances = Arrays.asList(9L, 40L, 200L);
        Approvals.verify(Day6.multipleOfNumberOfWaysToBeatRecord(times, distances));
    }

    @Test
    void multipleOfNumberOfWaysToBeatRecordPart2() {
        List<Integer> times = Arrays.asList(71530);
        List<Long> distances = Arrays.asList(940200L);
        Approvals.verify(Day6.multipleOfNumberOfWaysToBeatRecord(times, distances));
    }
}