package com.kosterico.factory.operators;

public class Minus implements Operation {
    @Override
    public double calculate(double n1, double n2) {

        return n1 - n2;
    }
}
