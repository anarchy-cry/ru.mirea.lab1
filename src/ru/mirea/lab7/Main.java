package ru.mirea.lab7;

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
        return "(" + x + ", " + y + ")";
    }
}

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }


    public boolean speedTest() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
                && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    public void moveUp() {
        if (speedTest()) { topLeft.moveUp(); bottomRight.moveUp(); }
    }
    public void moveDown() {
        if (speedTest()) { topLeft.moveDown(); bottomRight.moveDown(); }
    }
    public void moveLeft() {
        if (speedTest()) { topLeft.moveLeft(); bottomRight.moveLeft(); }
    }
    public void moveRight() {
        if (speedTest()) { topLeft.moveRight(); bottomRight.moveRight(); }
    }

    @Override
    public String toString() {
        return "Прямоугольник: верхняя левая точка " + topLeft
                + ", нижняя правая точка " + bottomRight;
    }
}

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1, 5, 6, 1, 2, 2);
        System.out.println("Одинаковые скорости: " + rectangle.speedTest());
        System.out.println(rectangle);
        rectangle.moveRight();
        rectangle.moveDown();
        System.out.println("После движения: " + rectangle);
    }
}
