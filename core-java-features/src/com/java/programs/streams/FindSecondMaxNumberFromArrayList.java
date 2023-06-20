package com.java.programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondMaxNumberFromArrayList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(8, 3, 1, 2, 10, 9,11);
        secondMaxNumber(integerList,2);

    }
    private static void secondMaxNumber(List<Integer> integerList,int n){
        integerList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(n-1)
                .limit(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
