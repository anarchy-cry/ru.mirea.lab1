package ru.mirea.lab2.practice_4;

public class Computer {
    private String name;
    private double price;

    public Computer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " — " + price + " руб.";
    }
}
