package org.adventofcode2023;

import java.util.List;

public class Day6 {
    public static Integer multipleOfNumberOfWaysToBeatRecord(List<Integer> raceTimes, List<Long> winningDistanceRecords) {
        int answer = 1;

        for (int i = 0; i < raceTimes.size(); i++) {
            int raceTime = raceTimes.get(i);
            long distanceToBeat = winningDistanceRecords.get(i);

            int numberOfWaysToWin = 0;

            for (int holdTime = 0; holdTime <= raceTime; holdTime++) {
                int distanceTraveled = holdTime * (raceTime - holdTime);

                if (distanceToBeat < distanceTraveled) {
                    numberOfWaysToWin++;
                }
            }

            answer *= numberOfWaysToWin;
        }

        return answer;
    }
}