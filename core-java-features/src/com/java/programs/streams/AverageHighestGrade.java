package com.java.programs.streams;

import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static java.util.Comparator.naturalOrder;
import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.groupingBy;

public class AverageHighestGrade {

    public static void main(String[] args) {
        String[][] scores={{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}};

        Double aDouble = Arrays.stream(scores)
                .collect(groupingBy(s -> s[0], averagingInt(s -> parseInt(s[1]))))
                .values()
                .stream()
                .max(naturalOrder())
                .stream()
                .findFirst()
                .orElse(0.0);
        System.out.println(aDouble);
    }
}
