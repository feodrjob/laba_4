package org.example;

public class SumOfLimits <T extends FunctionOnInterval> implements Functional<T>{
    @Override
    public double mapping(T func) {
        return func.solve(func.getLowerLimit()) + func.solve(func.getUpperLimit()) + func.solve((func.getUpperLimit() + func.getLowerLimit())/2);
    }
}
