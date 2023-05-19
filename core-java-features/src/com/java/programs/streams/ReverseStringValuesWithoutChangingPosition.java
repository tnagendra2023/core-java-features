package com.java.programs.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringValuesWithoutChangingPosition {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] stringArray = str.split("\\s");
        String reveresedString = Arrays.stream(stringArray)
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reveresedString);


    }
}
