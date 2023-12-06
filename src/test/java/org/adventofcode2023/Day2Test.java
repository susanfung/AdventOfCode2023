package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day2Test {
    @Test
    void sumOfValidGameIds() {
        Day2 cubesInBag = new Day2(12, 13, 14);
        List<String> gameslist = Arrays.asList("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green",
                                               "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue",
                                               "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red",
                                               "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red",
                                               "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green");
        Approvals.verify(Day2.sumOfValidGameIds(cubesInBag, gameslist));
    }
}