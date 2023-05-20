package com.java.programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementsFromArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,6,5,6};
        List<Map.Entry<String, Long>> duplicateList = Arrays.stream(arr)
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .toList();
        System.out.println(duplicateList);
    }
}
