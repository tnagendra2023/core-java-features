package com.java.designpatterns.builder;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final int horsePower;
    private final String color;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.horsePower = builder.horsePower;
        this.color = builder.color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getColor() {
        return color;
    }

    public static class Builder {
        private String brand;
        private String model;
        private int year;
        private int horsePower;
        private String color;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder horsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);

        }

    }
}
