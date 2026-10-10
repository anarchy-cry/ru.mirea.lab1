package ru.mirea.lab4;

enum Season {
    WINTER(-10), SPRING(8), SUMMER(22), AUTUMN(9);

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}

public class Main {

    public static void sayFavorite(Season season) {
        switch (season) {
            case WINTER: System.out.println("Мне нравится зима"); break;
            case SPRING: System.out.println("Мне нравится весна"); break;
            case SUMMER: System.out.println("Я люблю лето"); break;
            case AUTUMN: System.out.println("Мне нравится осень"); break;
        }
    }

    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemperature() + " °C");
        sayFavorite(favorite);

        System.out.println("\nВсе времена года:");
        for (Season season : Season.values()) {
            String description = season.getDescription();
            if (season == Season.SUMMER) {
                description = "Теплое время года";
            }
            System.out.println(season + ": " + season.getAverageTemperature()
                    + " °C, " + description);
        }
    }
}
