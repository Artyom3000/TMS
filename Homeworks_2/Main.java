package Homeworks_2;

public class Main {

    public static void main(String[] args) {

        Point leftUp = new Point(3, 10);
        Point rightDown = new Point(5, 4);
        Rectangle rectangle = new Rectangle(leftUp, rightDown);

        System.out.println("S = " + rectangle.Square());
        System.out.println("P = " + rectangle.Perimeter());
        System.out.println("Диагональ прямоугольника = " + rectangle.Diagonal());
        System.out.println("Расстояние между точками = " + leftUp.Distance(rightDown));
    }
}