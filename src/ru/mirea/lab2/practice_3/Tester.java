package ru.mirea.lab2.practice_3;

public class Tester {
    private Circle[] circles;
    private int count;
    public Tester(int capacity) { circles = new Circle[capacity]; }
    public void add(Circle circle) {
        if (count == circles.length) {
            throw new IllegalStateException("Массив заполнен");
        }
        circles[count++] = circle;
    }
    public void printAll() {
        for (int i = 0; i < count; i++) System.out.println(circles[i]);
    }
    public static void main(String[] args) {
        Tester tester = new Tester(3);
        tester.add(new Circle(new Point(0, 0), 5));
        tester.add(new Circle(new Point(2, 3), 2.5));
        tester.printAll();
    }
}
