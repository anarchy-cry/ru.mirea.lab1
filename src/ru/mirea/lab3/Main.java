package ru.mirea.lab3;

import java.text.NumberFormat;
import java.util.Locale;
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
        CurrencyConverter converter = new CurrencyConverter(80.0, 95.0);

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

        Locale rub = new Locale("ru", "RU");
        Locale usd = Locale.US;
        Locale eur = Locale.GERMANY;

        double result;
        Locale from;
        Locale to;
        switch (choice) {
            case 1:
                result = converter.rublesToDollars(amount);
                from = rub;
                to = usd;
                break;
            case 2:
                result = converter.dollarsToRubles(amount);
                from = usd;
                to = rub;
                break;
            case 3:
                result = converter.rublesToEuros(amount);
                from = rub;
                to = eur;
                break;
            case 4:
                result = converter.eurosToRubles(amount);
                from = eur;
                to = rub;
                break;
            default:
                System.out.println("Такого пункта меню нет.");
                return;
        }
        NumberFormat fromFormat = NumberFormat.getCurrencyInstance(from);
        NumberFormat toFormat = NumberFormat.getCurrencyInstance(to);
        System.out.println("Сумма: " + fromFormat.format(amount));
        System.out.println("Результат: " + toFormat.format(result));
    }

}