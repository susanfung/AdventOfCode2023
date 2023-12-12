package org.adventofcode2023;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day5Test {
    @Test
    void lowestLocationNumber() {
        List<Integer> seedList = Arrays.asList(79, 14, 55, 13);
        List<String> seedToSoilList = Arrays.asList("50 98 2", "52 50 48");
        List<String> soilToFertilizerList = Arrays.asList("0 15 37", "37 52 2", "39 0 15");
        List<String> fertilizerToWaterList = Arrays.asList("49 53 8", "0 11 42", "42 0 7", "57 7 4");
        List<String> waterToLightList = Arrays.asList("88 18 7", "18 25 70");
        List<String> lightToTemperatureList = Arrays.asList("45 77 23", "81 45 19", "68 64 13");
        List<String> temperatureToHumidityList = Arrays.asList("0 69 1", "1 0 69");
        List<String> humidityToLocationList = Arrays.asList("60 56 37", "56 93 4");

        Approvals.verify(Day5.lowestLocationNumber(seedList,
                                                   seedToSoilList,
                                                   soilToFertilizerList,
                                                   fertilizerToWaterList,
                                                   waterToLightList,
                                                   lightToTemperatureList,
                                                   temperatureToHumidityList,
                                                   humidityToLocationList));
    }

    @Test
    void createMap() {
        List<String> seedToSoilMap = Arrays.asList("50 98 2", "52 50 48");
        Approvals.verify(Day5.createMap(seedToSoilMap));
    }
}