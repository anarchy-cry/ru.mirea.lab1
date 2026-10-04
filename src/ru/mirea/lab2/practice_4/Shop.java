package ru.mirea.lab2.practice_4;

public class Shop {
    private Computer[] computers;
    private int count;

    public Shop(int capacity) {
        computers = new Computer[capacity];
    }

    public void add(Computer computer) {
        if (count < computers.length) {
            computers[count] = computer;
            count++;
        } else {
            System.out.println("В магазине нет свободного места.");
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    computers[j] = computers[j + 1];
                }
                computers[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public Computer find(String name) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getName().equalsIgnoreCase(name)) {
                return computers[i];
            }
        }
        return null;
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("Магазин пуст.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + computers[i]);
        }
    }
}
