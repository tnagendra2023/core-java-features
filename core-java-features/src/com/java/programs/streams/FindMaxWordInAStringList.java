package com.java.programs.streams;

import java.util.Arrays;
import java.util.List;

public class FindMaxWordInAStringList {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java", "Spring Boot", "AWS", "microservices");
        stringList.stream()
                .reduce((word1,word2)->word1.length()>word2.length()?word1:word2)
                .ifPresent(System.out::println);
    }
}
