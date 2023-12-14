package org.adventofcode2023;

public class Day5Map {
    public final Long sourceRangeStart;
    public final Long sourceRangeEnd;
    public final Long destinationRangeStart;
    public final int range;

    public Day5Map(Long sourceRangeStart, Long sourceRangeEnd, Long destinationRangeStart, int range) {
        this.sourceRangeStart = sourceRangeStart;
        this.sourceRangeEnd = sourceRangeEnd;
        this.destinationRangeStart = destinationRangeStart;
        this.range = range;
    }
}
