package ru.mirea.lab2.practice_10;

import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите слова через пробел:");
        String line = input.nextLine().trim();
        int count = line.isEmpty() ? 0 : line.split("\\s+").length;
        System.out.println("Количество слов: " + count);
    }
}
