package homework_8;

public class Ellipse extends Figure{
    private static final String NAME = "Ellipse";

   private double a;
   private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getArea() {
        double s = a * b * Math.PI;
        double p = 4 * (Math.PI * a * b + (a-b)) / a + b;
        return p;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
