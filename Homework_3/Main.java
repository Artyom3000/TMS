package Homework_3;

public class Main {

    public static void main(String[] args) {

        Point leftUp = new Point(1, 3);
        Point rightDown = new Point(4, 1);
        Rectangle rectangle = new Rectangle(leftUp, rightDown);

        System.out.println("Площадь прямоугольника = " + rectangle.Square());
        System.out.println("Периметр прямоугольника = " + rectangle.Perimeter());
        System.out.println("Длина диагонали = " + rectangle.Diagonal());
    }
}