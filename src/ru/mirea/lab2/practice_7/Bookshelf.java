package ru.mirea.lab2.practice_7;


import java.util.Arrays;
public class Bookshelf {
    private final Book[] books;
    private int count;
    public Bookshelf(int capacity) { books = new Book[capacity]; }
    public void add(Book book) { if (count < books.length) books[count++] = book; }
    public Book earliest() { check(); Book result = books[0]; for (int i=1;i<count;i++) if (books[i].getYear() < result.getYear()) result=books[i]; return result; }
    public Book latest() { check(); Book result = books[0]; for (int i=1;i<count;i++) if (books[i].getYear() > result.getYear()) result=books[i]; return result; }
    public void sortByYear() { Arrays.sort(books, 0, count, (a,b) -> Integer.compare(a.getYear(), b.getYear())); }
    public void print() { for (int i=0;i<count;i++) System.out.println(books[i]); }
    private void check() { if (count == 0) throw new IllegalStateException("Полка пуста"); }
}
