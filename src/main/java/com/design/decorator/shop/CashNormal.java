package com.design.decorator.shop;

/**
 * @author jzwu
 * @since 2024-08-21
 */
public class CashNormal implements ISale {

    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
