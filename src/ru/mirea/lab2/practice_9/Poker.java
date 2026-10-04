package ru.mirea.lab2.practice_9;

import java.util.*;
public class Poker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Количество игроков: "); int n = input.nextInt();
        if (n <= 0 || n * 5 > 52) { System.out.println("Игроков должно быть от 1 до 10."); return; }
        String[] suits = {"Пики", "Червы", "Бубны", "Трефы"}; String[] ranks = {"2","3","4","5","6","7","8","9","10","В","Д","К","Т"};
        List<String> deck = new ArrayList<>(); for (String suit : suits) for (String rank : ranks) deck.add(rank + " " + suit); Collections.shuffle(deck);
        for (int player = 0; player < n; player++) { System.out.println("Игрок " + (player + 1) + ":"); for (int card = 0; card < 5; card++) System.out.println(deck.get(player * 5 + card)); System.out.println(); }
    }
}
