package com.java.programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestRepeatedOddNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 2, 3, 1, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 7, 7, 7};

        Integer integer = Arrays.stream(arr)
                .boxed()
                .filter(value -> value % 2 != 0)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
               System.out.println(integer);

    }
}

