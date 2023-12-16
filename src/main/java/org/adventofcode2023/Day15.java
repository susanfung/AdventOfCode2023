package org.adventofcode2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Day15 {
    public static Integer sumOfInitializationSequence(List<String> initializationSequence) {
        int sum = 0;

        for (String string : initializationSequence) {
            sum += hashAlgorithm(string);
        }

        return sum;
    }

    public static Integer hashAlgorithm(String string) {
        int result = 0;

        for (int i = 0; i < string.length(); i++) {
            result += (int) string.charAt(i);
            result *= 17;
            result = result % 256;
        }

        return result;
    }

    public static Map<Integer, List<List<String>>> mapLensToBox(List<String> initializationSequence) {
        Map<Integer, List<List<String>>> boxContents = new HashMap<>();

        for (String string : initializationSequence) {
            List<String> hashMap = splitString(string);
            Integer boxNumber = hashAlgorithm(hashMap.get(0));

            if (hashMap.get(1).equals("=")) {
                if (boxContents.containsKey(boxNumber)) {
                    List<List<String>> contentsOfBox = boxContents.get(boxNumber);
                    boolean found = false;

                    for (List<String> list : contentsOfBox) {
                        if (list.get(0).equals(hashMap.get(0))) {
                            list.set(1, hashMap.get(2));
                            found = true;
                        }
                    }

                    if (!found) {
                        contentsOfBox.add(Arrays.asList(hashMap.get(0), hashMap.get(2)));
                    }

                    boxContents.put(boxNumber, contentsOfBox);
                } else {
                    List<List<String>> contentsOfBox = new ArrayList<>();
                    contentsOfBox.add(Arrays.asList(hashMap.get(0), hashMap.get(2)));
                    boxContents.put(boxNumber, contentsOfBox);
                }
            } else {
                if (boxContents.containsKey(boxNumber)) {
                    List<List<String>> contentsOfBox = boxContents.get(boxNumber);
                    Iterator<List<String>> iterator = contentsOfBox.iterator();

                    while (iterator.hasNext()) {
                        List<String> list = iterator.next();
                        if (list.get(0).equals(hashMap.get(0))) {
                            iterator.remove();
                        }
                    }
                }
            }

        }

        return boxContents;
    }

    private static List<String> splitString(String input) {
        List<String> resultList = new ArrayList<>();

        String[] parts = input.split("[=-]", -1);

        for (int i = 0; i < parts.length - 1; i++) {
            resultList.add(parts[i]);
            resultList.add(input.substring(parts[i].length(), parts[i].length() + 1));
        }

        resultList.add(parts[parts.length - 1]);

        return resultList;
    }

    public static Integer focusingPower(List<String> initializationSequence) {
        Map<Integer, List<List<String>>> boxContents = mapLensToBox(initializationSequence);
        int sum = 0;

        for (Integer key : boxContents.keySet()) {
            List<List<String>> contentsOfBox = boxContents.get(key);
            int boxSum = 0;

            for (List<String> list : contentsOfBox) {
                int listSum = (1 + key) * (contentsOfBox.indexOf(list) + 1) * Integer.parseInt(list.get(1));
                boxSum += listSum;
            }

            sum += boxSum;
        }

        return sum;
    }
}