package com.java.programs.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindLengthOfEachStringAndReturnAsAMap {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("java", "C", "C++");
        //output: {java=4, C=1, C++=3}

        Map<String, Integer> stringIntegerMap = stringList.stream()
                .collect(Collectors.toMap(
                        Function.identity(), //1.Input value itself
                        String::length, //2. length
                        (key1, key2) -> key1, // 3. duplicate KEY resolver
                        LinkedHashMap::new // 4. To maintain order
                ));
        System.out.println(stringIntegerMap);


    }
}
