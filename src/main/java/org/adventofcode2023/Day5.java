package org.adventofcode2023;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day5 {
    public static Long lowestLocationNumber(List<Long> seedList,
                                            List<String> seedToSoilList,
                                            List<String> soilToFertilizerList,
                                            List<String> fertilizerToWaterList,
                                            List<String> waterToLightList,
                                            List<String> lightToTemperatureList,
                                            List<String> temperatureToHumidityList,
                                            List<String> humidityToLocationList) {
        Map<Long, Long> seedToSoilMap = createMap(seedToSoilList);
        Map<Long, Long> soilToFertilizerMap = createMap(soilToFertilizerList);
        Map<Long, Long> fertilizerToWaterMap = createMap(fertilizerToWaterList);
        Map<Long, Long> waterToLightMap = createMap(waterToLightList);
        Map<Long, Long> lightToTemperatureMap = createMap(lightToTemperatureList);
        Map<Long, Long> temperatureToHumidityMap = createMap(temperatureToHumidityList);
        Map<Long, Long> humidityToLocationMap = createMap(humidityToLocationList);

        Set<Long> locations = new HashSet<>();

        for (Long seed : seedList) {
            long soil = (seedToSoilMap.get(seed) == null) ? seed : seedToSoilMap.get(seed);
            long fertilizer = (soilToFertilizerMap.get(soil) == null) ? soil : soilToFertilizerMap.get(soil);
            long water = (fertilizerToWaterMap.get(fertilizer) == null) ? fertilizer : fertilizerToWaterMap.get(fertilizer);
            long light = (waterToLightMap.get(water) == null) ? water : waterToLightMap.get(water);
            long temperature = (lightToTemperatureMap.get(light) == null) ? light : lightToTemperatureMap.get(light);
            long humidity = (temperatureToHumidityMap.get(temperature) == null) ? temperature : temperatureToHumidityMap.get(temperature);
            long location = (humidityToLocationMap.get(humidity) == null) ? humidity : humidityToLocationMap.get(humidity);

            locations.add(location);
        }

        return Collections.min(locations);
    }

    public static Map<Long, Long> createMap(List<String> stringList) {
        Map<Long, Long> map = new HashMap<>();

        for (String string : stringList) {
            String[] split = string.split(" ");

            long destinationRangeStart = Long.parseLong(split[0]);
            long sourceRangeStart = Long.parseLong(split[1]);
            int range = Integer.parseInt(split[2]);

            for (long i = sourceRangeStart, j = destinationRangeStart; i < sourceRangeStart + range && j < destinationRangeStart + range; i++, j++) {
                map.put(i, j);
            }
        }

        return map;
    }
}
