package org.example;

public class ExpFunction implements FunctionOnInterval{
    private final double A, B, upperLimit, lowerLimit;

    public ExpFunction(double a, double b, double upperLimit, double lowerLimit) {
        A = a;
        B = b;
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
    }

    @Override
    public double solve(double x) {
        if (x <= upperLimit && x >= lowerLimit) {
            return A * Math.exp(x) + B;
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