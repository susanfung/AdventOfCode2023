package org.adventofcode2023;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Day5 {
    public static Long lowestLocationNumber(List<Long> seedList,
                                            List<String> seedToSoilList,
                                            List<String> soilToFertilizerList,
                                            List<String> fertilizerToWaterList,
                                            List<String> waterToLightList,
                                            List<String> lightToTemperatureList,
                                            List<String> temperatureToHumidityList,
                                            List<String> humidityToLocationList) {
        List<Day5Map> seedToSoilMap = createMap(seedToSoilList);
        List<Day5Map> soilToFertilizerMap = createMap(soilToFertilizerList);
        List<Day5Map> fertilizerToWaterMap = createMap(fertilizerToWaterList);
        List<Day5Map> waterToLightMap = createMap(waterToLightList);
        List<Day5Map> lightToTemperatureMap = createMap(lightToTemperatureList);
        List<Day5Map> temperatureToHumidityMap = createMap(temperatureToHumidityList);
        List<Day5Map> humidityToLocationMap = createMap(humidityToLocationList);

        Long minimumLocation = Long.MAX_VALUE;

        for (Long seed : seedList) {
            long soil = seedToSoilMap.stream()
                                     .filter(map -> seed >= map.sourceRangeStart && seed <= map.sourceRangeEnd)
                                     .map(map -> map.destinationRangeStart + (seed - map.sourceRangeStart))
                                     .findFirst()
                                     .orElse(seed);

            long fertilizer = soilToFertilizerMap.stream()
                                                 .filter(map -> soil >= map.sourceRangeStart && soil <= map.sourceRangeEnd)
                                                 .map(map -> map.destinationRangeStart + (soil - map.sourceRangeStart))
                                                 .findFirst()
                                                 .orElse(soil);

            long water = fertilizerToWaterMap.stream()
                                             .filter(map -> fertilizer >= map.sourceRangeStart && fertilizer <= map.sourceRangeEnd)
                                             .map(map -> map.destinationRangeStart + (fertilizer - map.sourceRangeStart))
                                             .findFirst()
                                             .orElse(fertilizer);

            long light = waterToLightMap.stream()
                                        .filter(map -> water >= map.sourceRangeStart && water <= map.sourceRangeEnd)
                                        .map(map -> map.destinationRangeStart + (water - map.sourceRangeStart))
                                        .findFirst()
                                        .orElse(water);

            long temperature = lightToTemperatureMap.stream()
                                                    .filter(map -> light >= map.sourceRangeStart && light <= map.sourceRangeEnd)
                                                    .map(map -> map.destinationRangeStart + (light - map.sourceRangeStart))
                                                    .findFirst()
                                                    .orElse(light);

            long humidity = temperatureToHumidityMap.stream()
                                                    .filter(map -> temperature >= map.sourceRangeStart && temperature <= map.sourceRangeEnd)
                                                    .map(map -> map.destinationRangeStart + (temperature - map.sourceRangeStart))
                                                    .findFirst()
                                                    .orElse(temperature);

            long location = humidityToLocationMap.stream()
                                                 .filter(map -> humidity >= map.sourceRangeStart && humidity <= map.sourceRangeEnd)
                                                 .map(map -> map.destinationRangeStart + (humidity - map.sourceRangeStart))
                                                 .findFirst()
                                                 .orElse(humidity);

            if (location < minimumLocation) {
                minimumLocation = location;
            }
        }

        return minimumLocation;
    }

    public static List<Day5Map> createMap(List<String> stringList) {
        return stringList.stream()
                         .map(string -> string.split(" "))
                         .map(split -> new Day5Map(Long.parseLong(split[1]),
                                                   Long.parseLong(split[1]) + Integer.parseInt(split[2]) - 1,
                                                   Long.parseLong(split[0]),
                                                   Integer.parseInt(split[2])))
                         .collect(Collectors.toList());
    }
}
