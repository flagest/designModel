package com.design.factory.simple.factory;

/**
 * @author jzwu
 * @since 2024-08-02
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
