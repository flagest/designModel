package com.design.decorator.shop;


/**
 * @author jzwu
 * @since 2024-08-21
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = price * num * this.moneyRebate;
        return super.acceptCash(result, 1);
    }
}
