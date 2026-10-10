package ru.mirea.lab6;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getXSpeed() { return xSpeed; }
    public int getYSpeed() { return ySpeed; }

    public void moveUp() { y += ySpeed; }
    public void moveDown() { y -= ySpeed; }
    public void moveLeft() { x -= xSpeed; }
    public void moveRight() { x += xSpeed; }

    @Override
    public String toString() {
        return "Точка (" + x + ", " + y + "), скорость (" + xSpeed + ", " + ySpeed + ")";
    }
}

class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() { center.moveUp(); }
    public void moveDown() { center.moveDown(); }
    public void moveLeft() { center.moveLeft(); }
    public void moveRight() { center.moveRight(); }

    @Override
    public String toString() {
        return "Окружность с центром: " + center + ", радиус = " + radius;
    }
}

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2, 3, 1, 2);
        System.out.println(point);
        point.moveRight();
        point.moveUp();
        System.out.println("После движения: " + point);

        MovableCircle circle = new MovableCircle(0, 0, 2, 2, 5);
        System.out.println(circle);
        circle.moveRight();
        System.out.println("После движения: " + circle);
    }
}
