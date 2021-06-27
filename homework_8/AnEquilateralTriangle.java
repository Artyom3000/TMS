package homework_8;

import java.util.*;
import java.lang.*;
import java.io.*;

class AnEquilateralTriangle extends Figure{

    private static final String NAME = "AnEquilateralTriangle";

       private double a;
       private double S;

    public AnEquilateralTriangle( double a, double S) {
        this.a = a;
        this.S = S;
    }

    @Override
    public double getArea() {
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        S = (Math.sqrt(3)/4)*a*a;
        return S;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
