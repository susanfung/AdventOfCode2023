package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day7Test {
    @Test
    void countAndSortCharacters() {
        String string = "32T3K";
        Approvals.verifyAll("Character Counts", Day7.countAndSortCharacters(string));
    }
}