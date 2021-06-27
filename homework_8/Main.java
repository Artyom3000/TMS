package homework_8;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = {new Rectangle(8, 12),
                new Triangle(5, 8, 5),
                new Circle(10),
                new Parallelogram(16, 8),
                new Square(5),
                new Rhombus(5,9),
                new Ellipse(5, 6),
                new LsoscelesTriangle(24, 18),
                new Trapezoid(8, 5),
                new AnEquilateralTriangle(3,4)};

        for(Figure fig : figure)
            System.out.println(fig.getName() + ": S = " + fig.getArea());
    }
}