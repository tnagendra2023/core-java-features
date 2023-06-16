package com.java.designpatterns.singleton;

/**
 * In Java, the best optimized approach for implementing the Singleton design pattern
 * is to use the "Bill Pugh Singleton"
 * or the "Initialization-on-demand holder idiom."
 * This approach provides lazy initialization of the singleton instance
 * along with thread safety without the need for explicit synchronization.
 * Here's how you can implement it:
 */
public class Singleton {

    // Private constructor to prevent external instantiation
    private Singleton() {}

    /**
     * In this approach, the Singleton class contains a private static nested class
     * called SingletonHelper. The static instance of the Singleton class is
     * created when the SingletonHelper class is initialized,
     * which only happens when the getInstance() method is called for the first time.
     * This initialization is thread-safe due to the guarantees provided by the Java language.
     */
    private static class SingletonHelper {
        private static final Singleton instance = new Singleton();
    }

    /**
     * Using this approach, the Singleton instance is created
     * only when it is actually requested, providing lazy initialization.
     * Additionally, it avoids the need for explicit synchronization,
     * resulting in better performance.
     * This design pattern is recommended for most scenarios
     * where you require a Singleton instance.
     */

    public static Singleton getInstance() {
        return SingletonHelper.instance;
    }
}
