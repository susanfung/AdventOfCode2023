package org.adventofcode2023;

import java.util.List;

public class Day2 {
    public int red;
    public int green;
    public int blue;

    public Day2(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public static Integer sumOfValidGameIds(Day2 cubesInBag, List<String> gameslist) {
        int sumOfGameIds = 0;

        for (String game : gameslist) {
            String[] gameArray = game.split(":");
            String[] gameSubSets = gameArray[1].split(";");

            int red = 0;
            int green = 0;
            int blue = 0;
            boolean isOk = true;

            for (String subset : gameSubSets) {
                String[] cubes = subset.split(",");

                for (String cube : cubes) {
                    String[] cubeArray = cube.trim().split(" ");

                    int number = Integer.parseInt(cubeArray[0]);
                    String color = cubeArray[1];

                    if (color.equals("red")) {
                        red += number;
                    }

                    if (color.equals("green")) {
                        green += number;
                    }

                    if (color.equals("blue")) {
                        blue += number;
                    }
                }

                if (red > cubesInBag.red || green > cubesInBag.green || blue > cubesInBag.blue) {
                    isOk = false;
                    break;
                }
            }

            if (isOk) {
                sumOfGameIds += Integer.parseInt(gameArray[0].split(" ")[1]);
            }
        }

        return sumOfGameIds;
    }
}
