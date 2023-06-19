package com.java.programs.streams;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        String currentDateTime = getCurrentDateTime();
        System.out.println("Current DateTime: " + currentDateTime);
    }

    private static String getCurrentDateTime() {
        Supplier<LocalDate> dateTimeSupplier = () -> LocalDate.from(java.time.LocalDateTime.now());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
      return dateTimeSupplier.get().format(dateTimeFormatter);
    }
}
