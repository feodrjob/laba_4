package org.example;

public class RealFunction implements  FunctionOnInterval{
    private final double A, B, C, D, upperLimit, lowerLimit;

    public RealFunction(double a, double b, double c, double d, double upperLimit, double lowerLimit) {
        A = a;
        B = b;
        C = c;
        D = d;
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
    }

    @Override
    public double solve(double x) {
        if (x <= upperLimit && x >= lowerLimit) {
            return (A * x + B) / (C * x + D);
        }
        else {
            throw new IllegalArgumentException("argument x is not in range");
        }
    }


    @Override
    public double getUpperLimit() {
        return upperLimit;
    }

    @Override
    public double getLowerLimit() {
        return lowerLimit;
    }
}
