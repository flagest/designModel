package com.design.factory;

/**
 * @author jzwu
 * @since 2024-07-07
 */
public class Sub extends Operation {
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
