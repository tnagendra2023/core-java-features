package com.java.programs;

import java.util.concurrent.ConcurrentHashMap;
/** If multiple threads will concurrently access and modify the map, ConcurrentHashMap is a suitable choice.
    It provides thread-safe operations without the need for external synchronization.
    ConcurrentHashMap is failsafe ,it means while iterating the map if we do any modifications it won't throw any error
*   Whereas in Hashmap if we do so we will end up with ConcurrentModificationException which is fail fast
 *  Use ConcurrentHashMap when you require concurrent access and modification of the map
 *  Use HashMap when you don't have concurrent access requirements
* */

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("apple",1);
        concurrentHashMap.put("banana",2);
        concurrentHashMap.put("orange",3);
        concurrentHashMap.put("mango",4);

        concurrentHashMap.forEach((key, value) -> {
            if(key.equals("mango")){
                concurrentHashMap.remove("mango");
            }

            concurrentHashMap.put("pineapple",6);
        });
        System.out.println(concurrentHashMap);

    }
}
