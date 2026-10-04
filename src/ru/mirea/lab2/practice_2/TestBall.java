package ru.mirea.lab2.practice_2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(2.5, 3.5);
        System.out.println(ball);
        ball.move(1.5, -2.0);
        System.out.println("После перемещения: " + ball);
        ball.setXY(5, 44);
        System.out.println("После setXY: " + ball);
    }
}
