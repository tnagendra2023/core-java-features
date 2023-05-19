package com.java.programs;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseIntArrayWithoutCreatingAnotherArray {
    public static void main(String[] args) {
        int[] intArray={1,2,3,4};

        int[] array = Arrays.stream(intArray)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(array));

    }
}
