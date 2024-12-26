package org.example;

public class FunctionIntegral <T extends FunctionOnInterval> implements Functional<T> {
    final double lowerLimit, upperlimit;

    public FunctionIntegral(double a, double b) {
        this.lowerLimit = a;
        this.upperlimit = b;
    }

    @Override
    public double mapping(T func) {
        if (lowerLimit < func.getLowerLimit() || upperlimit > func.getUpperLimit()) {
            throw new IllegalArgumentException("Illegal Range");
        }
        double integral = 0;
        for (double i = lowerLimit; i < upperlimit; i += (upperlimit - lowerLimit)/25){
            integral += func.solve(i) * (upperlimit - lowerLimit)/25;
        }
        return integral;
    }
}
