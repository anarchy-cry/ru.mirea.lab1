package ru.mirea.lab2.practice_6;

public class CircleTest {
    public static void main(String[] args) {
        Circle first = new Circle(0, 0, 5), second = new Circle(2, 3, 5);
        System.out.println(first); System.out.println("Площадь: " + first.getArea());
        System.out.println("Длина окружности: " + first.getCircumference());
        System.out.println("Равны по радиусу: " + first.isEqual(second));
    }
}
