package ru.mirea.lab2.practice_4;

import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shop shop = new Shop(100);

        System.out.print("Количество компьютеров: ");
        int count = input.nextInt();
        input.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Название компьютера: ");
            String name = input.nextLine();

            System.out.print("Цена: ");
            double price = input.nextDouble();
            input.nextLine();

            shop.add(new Computer(name, price));
        }

        System.out.println("Все компьютеры в магазине:");
        shop.printAll();

        System.out.print("Введите название компьютера для поиска: ");
        String name = input.nextLine();
        Computer found = shop.find(name);

        if (found == null) {
            System.out.println("Компьютер не найден.");
        } else {
            System.out.println("Найден: " + found);
        }

        System.out.print("Введите название компьютера для удаления: ");
        name = input.nextLine();

        if (shop.remove(name)) {
            System.out.println("Компьютер удалён.");
        } else {
            System.out.println("Компьютер не найден.");
        }

        System.out.println("Обновлённый список:");
        shop.printAll();
    }
}
