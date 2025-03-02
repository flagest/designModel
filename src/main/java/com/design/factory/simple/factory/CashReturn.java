package com.design.factory.simple.factory;

import com.design.vistor.one.Man;

/**
 * @author jzwu
 * @since 2024-08-02
 */
public class CashReturn extends CashSuper {
    private double moneyCondition = 0d; // 返回条件
    private double moneyReturn = 0d; // 返利值

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = price * num;
        if (moneyCondition > 0 && result >= moneyCondition) {
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
