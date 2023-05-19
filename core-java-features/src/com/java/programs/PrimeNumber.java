package com.java.programs;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 5;
        if (isPrime(number)) {
            System.out.println("prime");
        } else {
            System.out.println("Not a prime");
        }
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        return num == 2 || num % 2 != 0;
    }
}
