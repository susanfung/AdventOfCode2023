package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day7Test {
    @Test
    void totalWinnings() {
        List<String> cardsAndBids = Arrays.asList("32T3K 765", "T55J5 684", "KK677 28", "KTJJT 220", "QQQJA 483");
        Approvals.verify(Day7.totalWinnings(cardsAndBids));
    }

    @Test
    void countAndSortCharacters() {
        String string = "32T3K";
        Approvals.verifyAll("Character Counts", Day7.countAndSortCharacters(string));
    }
}