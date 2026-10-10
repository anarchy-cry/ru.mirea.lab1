package ru.mirea.lab3;

import java.util.Scanner;

class CurrencyConverter {
    private double usdRate;
    private double eurRate;

    public CurrencyConverter(double usdRate, double eurRate) {
        this.usdRate = usdRate;
        this.eurRate = eurRate;
    }

    public double rublesToDollars(double rubles) {
        return rubles / usdRate;
    }

    public double dollarsToRubles(double dollars) {
        return dollars * usdRate;
    }

    public double rublesToEuros(double rubles) {
        return rubles / eurRate;
    }

    public double eurosToRubles(double euros) {
        return euros * eurRate;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter(90.0, 98.0);

        System.out.println("Конвертер валют (учебные курсы)");
        System.out.println("1 — рубли в доллары");
        System.out.println("2 — доллары в рубли");
        System.out.println("3 — рубли в евро");
        System.out.println("4 — евро в рубли");
        System.out.print("Выберите действие: ");
        int choice = scanner.nextInt();
        System.out.print("Введите сумму: ");
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Сумма не может быть отрицательной.");
            return;
        }

        double result;
        String currency;
        switch (choice) {
            case 1: result = converter.rublesToDollars(amount); currency = "USD"; break;
            case 2: result = converter.dollarsToRubles(amount); currency = "RUB"; break;
            case 3: result = converter.rublesToEuros(amount); currency = "EUR"; break;
            case 4: result = converter.eurosToRubles(amount); currency = "RUB"; break;
            default:
                System.out.println("Такого пункта меню нет.");
                return;
        }
        System.out.printf("Результат: %.2f %s%n", result, currency);
    }
}
