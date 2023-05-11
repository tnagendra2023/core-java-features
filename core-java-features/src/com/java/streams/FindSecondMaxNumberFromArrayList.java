package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondMaxNumberFromArrayList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(8, 3, 1, 2, 10, 9);
        integerList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
