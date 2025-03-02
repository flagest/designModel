package com.design.decorator.shop;

/**
 * @author jzwu
 * @since 2024-08-21
 */
public class CashSuper implements ISale {
    private ISale component;

    public void decorate(ISale component) {
        this.component = component;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = 0d;
        if (this.component != null) {
            result = this.component.acceptCash(price, num);
        }
        return result;
    }
}
