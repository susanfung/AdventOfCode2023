package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Day15Test {
    @Test
    void sumOfInitializationSequence() {
        List<String> initializationSequence = Arrays.asList("rn=1", "cm-", "qp=3", "cm=2", "qp-", "pc=4", "ot=9", "ab=5", "pc-", "pc=6", "ot=7");
        Approvals.verify(Day15.sumOfInitializationSequence(initializationSequence));
    }

    @Test
    void hashAlgorithm() {
        String string = "HASH";
        Approvals.verify(Day15.hashAlgorithm(string));
    }
}