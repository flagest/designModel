package com.design.factory.simple.factory;

/**
 * @author jzwu
 * @since 2024-08-02
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double price, int num) {
        return price * num * this.moneyRebate;
    }
}
