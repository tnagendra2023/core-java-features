package com.java.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedWordInAStringList {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("microservices", "java", "pcf", "java", "pcf");
        stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry ->stringLongEntry.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
