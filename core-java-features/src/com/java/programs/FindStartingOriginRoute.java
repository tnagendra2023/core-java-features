package com.java.programs;

import java.util.*;

public class FindStartingOriginRoute {
    public static String findStartingPlace(List<String[]> routes) {
        Set<String> destinations = new HashSet<>();
        Set<String> origins = new HashSet<>();
        for (String[] route : routes) {
            destinations.add(route[1]);
            origins.add(route[0]);
        }

        origins.removeAll(destinations);

        if (origins.size() == 1) {
            return origins.iterator().next();
        } else {
            throw new IllegalArgumentException("Invalid journey: multiple starting places or circular routes.");
        }
    }

    public static void main(String[] args) {
        List<String[]> routes = new ArrayList<>();
        routes.add(new String[]{"CHENNAI", "HYDERABAD"});
        routes.add(new String[]{"CALCUTTA", "DELHI"});
        routes.add(new String[]{"HYDERABAD", "CALCUTTA"});
        routes.add(new String[]{"DELHI", "BOMBAY"});

        String startingPlace = findStartingPlace(routes);
        System.out.println("Starting place: " + startingPlace);
    }
}
