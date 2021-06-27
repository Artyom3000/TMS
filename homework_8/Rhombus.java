package homework_8;

public class Rhombus extends Figure {
    private static final String NAME = "Rhombus";

    private double footing;
    private double height;

    public Rhombus(double footing, double height) {
        this.footing = footing;
        this.height = height;
    }

    @Override
    public double getArea() {
        return footing * height;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getWidth() {
        return footing;
    }
}