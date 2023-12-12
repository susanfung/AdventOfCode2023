package org.adventofcode2023;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day5 {
    public static Integer lowestLocationNumber(List<Integer> seedList,
                                               List<String> seedToSoilList,
                                               List<String> soilToFertilizerList,
                                               List<String> fertilizerToWaterList,
                                               List<String> waterToLightList,
                                               List<String> lightToTemperatureList,
                                               List<String> temperatureToHumidityList,
                                               List<String> humidityToLocationList) {
        Map<Integer, Integer> seedToSoilMap = createMap(seedToSoilList);
        Map<Integer, Integer> soilToFertilizerMap = createMap(soilToFertilizerList);
        Map<Integer, Integer> fertilizerToWaterMap = createMap(fertilizerToWaterList);
        Map<Integer, Integer> waterToLightMap = createMap(waterToLightList);
        Map<Integer, Integer> lightToTemperatureMap = createMap(lightToTemperatureList);
        Map<Integer, Integer> temperatureToHumidityMap = createMap(temperatureToHumidityList);
        Map<Integer, Integer> humidityToLocationMap = createMap(humidityToLocationList);

        Set<Integer> locations = new HashSet<>();

        for (int seed : seedList) {
            int soil = (seedToSoilMap.get(seed) == null) ? seed : seedToSoilMap.get(seed);
            int fertilizer = (soilToFertilizerMap.get(soil) == null) ? soil : soilToFertilizerMap.get(soil);
            int water = (fertilizerToWaterMap.get(fertilizer) == null) ? fertilizer : fertilizerToWaterMap.get(fertilizer);
            int light = (waterToLightMap.get(water) == null) ? water : waterToLightMap.get(water);
            int temperature = (lightToTemperatureMap.get(light) == null) ? light : lightToTemperatureMap.get(light);
            int humidity = (temperatureToHumidityMap.get(temperature) == null) ? temperature : temperatureToHumidityMap.get(temperature);
            int location = (humidityToLocationMap.get(humidity) == null) ? humidity : humidityToLocationMap.get(humidity);

            locations.add(location);
        }

        return Collections.min(locations);
    }

    public static Map<Integer, Integer> createMap(List<String> stringList) {
        Map<Integer, Integer> map = new HashMap<>();

        for (String string : stringList) {
            String[] split = string.split(" ");

            int destinationRangeStart = Integer.parseInt(split[0]);
            int sourceRangeStart = Integer.parseInt(split[1]);
            int range = Integer.parseInt(split[2]);

            for (int i = sourceRangeStart, j = destinationRangeStart; i < sourceRangeStart + range && j < destinationRangeStart + range; i++, j++) {
                map.put(i, j);
            }
        }

        return map;
    }
}
