package ru.mirea.lab2.practice_1;


public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Maxim", "random@icloud.com", 'm');
        System.out.println(author);
        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        author.setEmail("notrandom@icloud.com");
        System.out.println("Новый email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
    }
}
