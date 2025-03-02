package com.design.factory.factorystaragedecotor;

import com.design.decorator.shop.CashNormal;
import com.design.decorator.shop.CashRebate;
import com.design.decorator.shop.CashReturn;
import com.design.decorator.shop.ISale;

/**
 * @author jzwu
 * @since 2024-08-31
 */
public class CashReturnRebateFactory implements IFactory {
    private double moneyRebate = 1d;
    private double moneyCondition = 0d;
    private double moneyReturn = 0d;

    public CashReturnRebateFactory(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    /**
     * 先满减再打折
     *
     * @return
     */
    @Override
    public ISale createSalesModel() {
        CashNormal cn2 = new CashNormal();
        CashRebate cr3 = new CashRebate(this.moneyRebate);
        CashReturn cr4 = new CashReturn(this.moneyCondition, this.moneyReturn);
        cr3.decorate(cn2);  // 用打折算法包装基本的原价算法
        cr4.decorate(cr3); // 满m返n算法打x折算法
        return cr4; // 将包装好的算法组合返回
    }
}
