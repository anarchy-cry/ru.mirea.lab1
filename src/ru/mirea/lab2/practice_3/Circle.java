package ru.mirea.lab2.practice_3;

public class Circle {
    private Point center;
    private double radius;
    public Circle(Point center, double radius) {
        this.center = center; this.radius = radius;
    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override public String toString() {
        return "Circle[center=" + center + ", radius=" + radius + "]";
    }
}
