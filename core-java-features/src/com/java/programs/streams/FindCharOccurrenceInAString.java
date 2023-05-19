package com.java.programs.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharOccurrenceInAString {
    public static void main(String[] args) {
        String str="helloword";
        LinkedHashMap<String, Long> stringOccurrenceMap = Arrays.stream(str.split(""))
                .collect(
                        Collectors.groupingBy(Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()));
        System.out.println(stringOccurrenceMap);
    }
}
