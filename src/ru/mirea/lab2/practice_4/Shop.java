package ru.mirea.lab2.practice_4;

public class Shop {
    private Computer[] comp;
    private int count;

    public Shop(int capacity) {
        comp = new Computer[capacity];
    }

    public void add(Computer computer) {
        if (count < comp.length) {
            comp[count] = computer;
            count++;
        } else {
            System.out.println("В магазине нет свободного места.");
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < count; i++) {
            if (comp[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    comp[j] = comp[j + 1];
                }
                comp[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public Computer find(String name) {
        for (int i = 0; i < count; i++) {
            if (comp[i].getName().equalsIgnoreCase(name)) {
                return comp[i];
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
            System.out.println((i + 1) + ". " + comp[i]);
        }
    }
}
