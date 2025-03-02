package com.design.factory.detail;

import com.design.factory.Operation;

/**
 * @author jzwu
 * @since 2024-07-27
 */
public class Pow extends Operation {
    public double getResult(double number1, double number2) {
        return Math.pow(number1, number2);
    }

}
