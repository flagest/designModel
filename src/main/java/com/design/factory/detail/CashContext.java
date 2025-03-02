package com.design.factory.detail;

import com.design.factory.simple.factory.CashNormal;
import com.design.factory.simple.factory.CashRebate;
import com.design.factory.simple.factory.CashReturn;
import com.design.factory.simple.factory.CashSuper;

/**
 * @author jzwu
 * @since 2024-08-07
 */
public class CashContext {
    private CashSuper cs;

    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                this.cs = new CashNormal();
                break;
            case 2:
                this.cs = new CashRebate(0.8d);
                break;
            case 3:
                this.cs = new CashRebate(0.7d);
                break;
            case 4:
                this.cs = new CashReturn(300d, 100d);
                break;
            default:
                this.cs = new CashNormal();
                break;
        }
    }

    public double getResult(double price, int num) {
        return this.cs.acceptCash(price, num);
    }
}
