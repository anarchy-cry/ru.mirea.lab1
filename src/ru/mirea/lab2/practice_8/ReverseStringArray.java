package ru.mirea.lab2.practice_8;

import java.util.Arrays;
import java.util.Scanner;
public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите слова через пробел: ");
        String[] values = input.nextLine().trim().split("\\s+");
        for (int left = 0, right = values.length - 1; left < right; left++, right--) { String temp = values[left]; values[left] = values[right]; values[right] = temp; }
        System.out.println(Arrays.toString(values));
    }
}
