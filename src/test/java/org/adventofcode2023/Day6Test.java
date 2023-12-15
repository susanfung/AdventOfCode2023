package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day6Test {
    @Test
    void answerDay6Part1() {
        List<Long> times = Arrays.asList(55L, 99L, 97L, 93L);
        List<Long> distances = Arrays.asList(401L, 1485L, 2274L, 1405L);
        Approvals.verify(Day6.multipleOfNumberOfWaysToBeatRecord(times, distances));
    }

    @Test
    void answerDay6Part2() {
        List<Long> times = Arrays.asList(55999793L);
        List<Long> distances = Arrays.asList(401148522741405L);
        Approvals.verify(Day6.multipleOfNumberOfWaysToBeatRecord(times, distances));
    }

    @Test
    void multipleOfNumberOfWaysToBeatRecordPart1() {
        List<Long> times = Arrays.asList(7L, 15L, 30L);
        List<Long> distances = Arrays.asList(9L, 40L, 200L);
        Approvals.verify(Day6.multipleOfNumberOfWaysToBeatRecord(times, distances));
    }

    @Test
    void multipleOfNumberOfWaysToBeatRecordPart2() {
        List<Long> times = Arrays.asList(71530L);
        List<Long> distances = Arrays.asList(940200L);
        Approvals.verify(Day6.multipleOfNumberOfWaysToBeatRecord(times, distances));
    }
}