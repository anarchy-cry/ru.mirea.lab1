package ru.mirea.lab4;


abstract class Shape {
    public abstract String getType();
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return getType() + ": площадь = " + getArea()
                + ", периметр = " + getPerimeter();
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() { return "Круг"; }

    @Override
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
}

class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() { return "Прямоугольник"; }

    @Override
    public double getArea() { return width * height; }

    @Override
    public double getPerimeter() { return 2 * (width + height); }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() { return "Квадрат"; }
}

public class Practice41 {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(3),
                new Rectangle(4, 5),
                new Square(4)
        };

        for (Shape shape : shapes) {

            System.out.println(shape);
        }
    }
}
