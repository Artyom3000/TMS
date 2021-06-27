package homework_8;

public class Trapezoid extends Figure{
    private static final String NAME = "Trapezoid";

    private double height;
    private double middleLinea;

    public Trapezoid( double height, double middleLinea) {
        this.height = height;
        this.middleLinea = middleLinea;

    }

    @Override
    public double getArea() {
       double s = height * middleLinea;
       return s;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
