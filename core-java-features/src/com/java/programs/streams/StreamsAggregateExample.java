package com.java.programs.streams;

import java.util.*;

public class StreamsAggregateExample {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println("Nth Highest salary: "+nthHighestNum(1,primes));
        System.out.println("Min: "+getMinMaxAverageCount(primes).getMin());
        System.out.println("Max: "+getMinMaxAverageCount(primes).getMax());
        System.out.println("Average: "+getMinMaxAverageCount(primes).getAverage());
        System.out.println("Count: "+getMinMaxAverageCount(primes).getCount());
        System.out.println("Count: "+getMinMaxAverageCount(primes).getSum());

    }

    /* Nth highest number logic*/
    private static int nthHighestNum(int n, List<Integer> integers){
        return integers.stream()
                .sorted(Collections.reverseOrder())
                .skip(n-1)
                .limit(1)
                .findFirst()
                .orElse(0);
    }

    private static IntSummaryStatistics getMinMaxAverageCount(List<Integer> integerList){
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

    }
}
