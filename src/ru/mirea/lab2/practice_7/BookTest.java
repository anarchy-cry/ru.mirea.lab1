package ru.mirea.lab2.practice_7;

public class BookTest {
    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf(4);
        shelf.add(new Book("А. Пушкин", "Евгений Онегин", 1833)); shelf.add(new Book("М. Булгаков", "Мастер и Маргарита", 1967)); shelf.add(new Book("Л. Толстой", "Война и мир", 1869));
        System.out.println("Ранняя: " + shelf.earliest()); System.out.println("Поздняя: " + shelf.latest());
        shelf.sortByYear(); System.out.println("По возрастанию года:"); shelf.print();
    }
}
