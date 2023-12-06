package org.adventofcode2023;

import java.util.List;

public class Day2 {
    public final int red;
    public final int green;
    public final int blue;

    public Day2(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public static Integer sumOfValidGameIds(Day2 cubesInBag, List<String> gameslist) {
        int sumOfGameIds = 0;
        boolean isOk = true;

        for (String game : gameslist) {
            int red = 0;
            int green = 0;
            int blue = 0;

            String[] gameArray = game.split(":");
            String[] gameSubSets = gameArray[1].split(";");

            for (String subset : gameSubSets) {
                String[] cubes = subset.split(",");

                for (String cube : cubes) {
                    String[] cubeArray = cube.trim().split(" ");

                    int number = Integer.parseInt(cubeArray[0]);
                    String color = cubeArray[1];

                    if (color.contains("red")) {
                        red += number;
                    }

                    if (color.contains("green")) {
                        green += number;
                    }

                    if (color.contains("blue")) {
                        blue += number;
                    }
                    if (red > cubesInBag.red || green > cubesInBag.green || blue > cubesInBag.blue) {
                        isOk = false;
                    }
                }

                red = 0;
                green = 0;
                blue = 0;
            }

            if (isOk) {
                sumOfGameIds += Integer.parseInt(gameArray[0].split(" ")[1]);
            }

            isOk = true;
        }

        return sumOfGameIds;
    }
}
