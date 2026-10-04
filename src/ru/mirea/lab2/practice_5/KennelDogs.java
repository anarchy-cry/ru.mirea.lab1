package ru.mirea.lab2.practice_5;

public class KennelDogs {
    private Dog[] dogs;
    private int count;
    public KennelDogs(int capacity) { dogs = new Dog[capacity]; }
    public void addDog(Dog dog) { if (count < dogs.length) dogs[count++] = dog; }
    public static void main(String[] args) {
        KennelDogs kennel = new KennelDogs(3);
        kennel.addDog(new Dog("Бобик", 3)); kennel.addDog(new Dog("Шарик", 5));
        for (int i = 0; i < kennel.count; i++) System.out.println(kennel.dogs[i]);
    }
}
