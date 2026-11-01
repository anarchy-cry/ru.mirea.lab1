package ru.mirea.lab4;


abstract class Transport {
    protected String name;
    protected double speed;
    protected int maxPassengers;
    protected double maxCargo;
    protected double pricePassengerKm;
    protected double priceTonKm;

    public Transport(String name, double speed, int maxPassengers, double maxCargo,
                     double pricePassengerKm, double priceTonKm) {
        this.name = name;
        this.speed = speed;
        this.maxPassengers = maxPassengers;
        this.maxCargo = maxCargo;
        this.pricePassengerKm = pricePassengerKm;
        this.priceTonKm = priceTonKm;
    }


    public abstract String getType();


    public abstract double getExtraTime();

    public double getTravelTime(double distance) {
        return distance / speed + getExtraTime();
    }

    public double getPassengerCost(double distance, int passengers) {
        if (passengers > maxPassengers) {
            System.out.println( getType() + " не вмещает " + passengers
                    + " пассажиров (максимум " + maxPassengers + ")");
            return -1;
        }
        return distance * passengers * pricePassengerKm;
    }


    public double getCargoCost(double distance, double tons) {
        if (tons > maxCargo) {
            System.out.println( getType() + " не может везти " + tons
                    + " т груза (максимум " + maxCargo + " т)");
            return -1;
        }
        return distance * tons * priceTonKm;
    }

    public void printTrip(double distance, int passengers, double tons) {
        System.out.println(this);
        System.out.printf("  Время в пути на %.0f км: %.2f ч%n", distance, getTravelTime(distance));
        double pc = getPassengerCost(distance, passengers);
        if (pc >= 0) System.out.printf("  Перевозка %d пассажиров: %.2f руб.%n", passengers, pc);
        double cc = getCargoCost(distance, tons);
        if (cc >= 0) System.out.printf("  Перевозка %.1f т груза: %.2f руб.%n", tons, cc);
        System.out.println();
    }

    @Override
    public String toString() {
        return getType() + " \"" + name + "\" (скорость " + speed + " км/ч, мест: "
                + maxPassengers + ", груз до " + maxCargo + " т)";
    }
}

class Car extends Transport {
    public Car(String name) {
        super(name, 80, 4, 0.5, 5.0, 20.0);
    }

    @Override
    public String getType() { return "Автомобиль"; }

    @Override
    public double getExtraTime() { return 0.1; }
}

class Airplane extends Transport {
    private final double airportFee = 2000;

    public Airplane(String name) {
        super(name, 800, 180, 20, 6.0, 30.0);
    }

    @Override
    public String getType() { return "Самолёт"; }

    @Override
    public double getExtraTime() { return 2.5; }

    @Override
    public double getPassengerCost(double distance, int passengers) {
        double base = super.getPassengerCost(distance, passengers);
        if (base < 0) {
            return base; }
        return base + passengers * airportFee;
    }
}

class Train extends Transport {
    public Train(String name) {
        super(name, 90, 600, 3000, 2.5, 3.0);
    }

    @Override
    public String getType() { return "Поезд"; }

    @Override
    public double getExtraTime() { return 0.5; }
}

class Ship extends Transport {
    public Ship(String name) {
        super(name, 30, 300, 20000, 3.0, 1.0);
    }

    @Override
    public String getType() { return "Корабль"; }

    @Override
    public double getExtraTime() { return 4.0; }
}

public class Abss {
    public static void main(String[] args) {


        Transport[] fleet = {
                new Car("Lada Vesta"),
                new Airplane("Boeing 737"),
                new Train("Сапсан"),
                new Ship("Михаил Светлов")
        };

        double distance = 700;
        int passengers = 3;
        double cargo = 0.3;

        System.out.println("Рейс: " + distance + " км, " + passengers
                + " пассажира, " + cargo + " т груза\n");
        for (Transport t : fleet) {
            t.printTrip(distance, passengers, cargo);
        }

        System.out.println("Большая партия: 100 пассажиров, 50 т груза\n");
        for (Transport t : fleet) {
            t.printTrip(distance, 100, 50);
        }
    }
}