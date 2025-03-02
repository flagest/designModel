package com.design.factory.simple.factory;

/**
 * @author jzwu
 * @since 2024-08-02
 */
public class Run {
    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept(8);
        double totalPrices = cashSuper.acceptCash(100, 300);
        //totalPrices+total

    }
}
