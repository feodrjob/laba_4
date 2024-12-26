package org.example;

public interface Functional<T extends FunctionOnInterval> {
    double mapping(T func);
}
