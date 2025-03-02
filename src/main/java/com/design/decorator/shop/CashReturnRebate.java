package com.design.decorator.shop;

import com.design.factory.simple.factory.CashSuper;

/**
 * @author jzwu
 * @since 2024-08-18
 */
public class CashReturnRebate extends CashSuper {
    private double moneyRebate = 1d; //返回条件
    private double moneyCondition = 0d; //返回条件
    private double moneyReturn = 0d; // 返利值

    public CashReturnRebate(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    /*
     * 先折再返利
     */
    @Override
    public double acceptCash(double price, int num) {
        double result = price * num * this.moneyRebate;
        if (moneyCondition > 0 && result >= moneyRebate) {
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
