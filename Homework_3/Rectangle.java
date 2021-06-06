package Homework_3;

public class Rectangle {

    private Point leftUp, rightDown;

    public Rectangle(Point leftUp, Point rightDown) {
        this.leftUp = leftUp;
        this.rightDown = rightDown;
    }
    public double Square() {
        return (leftUp.getY() - rightDown.getY()) * (rightDown.getX() - leftUp.getX());
    }

    public double Perimeter() {
        return ((leftUp.getY() - rightDown.getY()) + (rightDown.getX() - leftUp.getX())) * 2;
    }

    public double Diagonal() {
        return Math.hypot(leftUp.getY() - rightDown.getY(), rightDown.getX() - leftUp.getX());
    }
}