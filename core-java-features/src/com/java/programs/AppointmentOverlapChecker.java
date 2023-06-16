package com.java.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class AppointmentOverlapChecker {
    public static boolean hasOverlap(Interval[] intervals) {
        // Sort the intervals based on start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a.start));

        for (int i = 1; i < intervals.length; i++) {
            int nextAppointmentStart = intervals[i].start;
            int currentAppointmentEnd = intervals[i - 1].end;
            // Check for overlap
            if (nextAppointmentStart < currentAppointmentEnd) {
                return true; // Overlapping appointments
            }
        }

        return false; // Non-overlapping appointments
    }

    public static void main(String[] args) {
        // Example usage
        Interval[] intervals = {
          /*      new com.java.programs.Interval(1, 4),
                new com.java.programs.Interval(2, 5),
                new com.java.programs.Interval(7, 9)*/

              /*  new com.java.programs.Interval(6, 7),
                new com.java.programs.Interval(2, 4),
                new com.java.programs.Interval(8, 12),
                new com.java.programs.Interval(4, 6)*/

                new Interval(1, 2),
                new Interval(2, 3),
                new Interval(5, 7),
                new Interval(7, 9)
        };

        boolean hasOverlap = hasOverlap(intervals);
        System.out.println("Appointments have overlap: " + hasOverlap);
        Function<String,String> f= String::toUpperCase;
    }
}
