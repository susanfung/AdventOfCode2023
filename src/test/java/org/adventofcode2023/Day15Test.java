package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class Day15Test {
    @Test
    void hashAlgorithm() {
        String string = "HASH";
        Approvals.verify(Day15.hashAlgorithm(string));
    }
}