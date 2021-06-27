package homework_8;

import static java.lang.Math.*;
public class LsoscelesTriangle extends Figure {
    private static final String NAME = "LsoscelesTriangle";

    private double sideLength;
    private double angle;

    public LsoscelesTriangle(double sideLength, double angle) {
        this.sideLength = sideLength;
        this.angle = angle;
    }

    @Override
    public double getArea() {
            sideLength = 1;
            angle = PI / 3;
            return angle;
        }
        private double getAnotherSide() {
            return sideLength * Math.sqrt(2 * (1 - cos(angle)));
        }

        public double getSquare() {
            return 1 / 2 * sideLength * sideLength * sin(angle);
        }


        public double getPerim() {
            return 2 * sideLength + getAnotherSide();
        }

        public boolean isObtuse() {
            return angle > PI / 2;
        }

        public double getSideLength() {
            return sideLength;
        }

        public void setSideLength(double sideLength) {
            this.sideLength = sideLength;
        }

        public double getAngle() {
            return angle;
        }

        public void setAngle(double angle) {
            this.angle = angle;
        }
    @Override
    public String getName() {
        return NAME;
    }
}