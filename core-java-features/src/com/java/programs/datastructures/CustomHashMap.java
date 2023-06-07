package com.java.programs.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("cat", 1);
        map.put("dog", 2);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.get("cat"));    // Output: 1
        System.out.println(map.get("dog"));    // Output: 2
        System.out.println(map.get("three"));  // Output: 3
        System.out.println(map.get("four"));   // Output: null

        map.remove("dog");

        System.out.println(map.get("two"));    // Output: 2

        System.out.println(map.size());        // Output: 3
    }
}

public class CustomHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;

    private List<Entry<K, V>>[] buckets;
    private int size;
    private final double loadFactor;

    public CustomHashMap() {
        this.buckets = new ArrayList[DEFAULT_CAPACITY];
        this.size = 0;
        this.loadFactor = DEFAULT_LOAD_FACTOR;
    }

    public void put(K key, V value) {
        Objects.requireNonNull(key, "Key cannot be null");

        if (size + 1 > loadFactor * buckets.length) {
            resize();
        }

        int index = getIndex(key);
        List<Entry<K, V>> bucket = getBucket(index);

        /*If key already present then replace value logic*/
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new Entry<>(key,value));
        size++;
    }

    public V get(K key) {
        int index = getIndex(key);
        List<Entry<K, V>> bucket = getBucket(index);

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public void remove(K key) {

        int index = getIndex(key);
        List<Entry<K, V>> bucket = getBucket(index);

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    public int size() {
        return size;
    }

    private int getIndex(K key) {
        return key.hashCode() % buckets.length;
    }

    private List<Entry<K, V>> getBucket(int index) {
        if (buckets[index] == null) {
            buckets[index] = new ArrayList<>();
        }
        return buckets[index];
    }

    private void resize() {
        List<Entry<K, V>>[] newBuckets = new ArrayList[buckets.length * 2];

        for (List<Entry<K, V>> bucket : buckets) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    int newIndex = entry.getKey().hashCode() % newBuckets.length;
                    if (newBuckets[newIndex] == null) {
                        newBuckets[newIndex] = new ArrayList<>();
                    }
                    newBuckets[newIndex].add(entry);
                }
            }
        }

        buckets = newBuckets;
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
