package org.example;

public class SinFunction  implements FunctionOnInterval {
    private final double A, B, upperLimit, lowerLimit;

    public SinFunction(double a, double b, double upperLimit, double lowerLimit) {
        A = a;
        B = b;
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
    }

    @Override
    public double solve(double x) {
        if (x <= upperLimit && x >= lowerLimit) {
            return A * Math.sin(B * x);
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
