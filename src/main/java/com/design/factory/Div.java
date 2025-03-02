package com.design.factory;

/**
 * @author jzwu
 * @since 2024-07-07
 */
public class Div extends Operation {
    public double getResult(double numberA, double numberB) {
        if (numberB == 0) {
            throw new ArithmeticException("sub number is not null !");
        }
        return numberA / numberB;
    }
}
