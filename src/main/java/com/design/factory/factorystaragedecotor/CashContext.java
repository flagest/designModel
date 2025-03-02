package com.design.factory.factorystaragedecotor;

import com.design.decorator.shop.ISale;

/**
 * @author jzwu
 * @since 2024-08-31
 */
public class CashContext {
    private ISale cs; // 声明一个ISale 接口对象

    public CashContext(int cashType) {
        IFactory fs = null;
        switch (cashType) {
            case 1://原价
                fs = new CashRebateReturnFactory(1d, 0d, 0d);
                break;
            case 2: //打8折
                fs = new CashRebateReturnFactory(0.8, 0d, 0d);
                break;
            case 3:// 打7折
                fs = new CashRebateReturnFactory(0.7, 0d, 0d);
                break;
            case 4: // 满300返100
                fs = new CashRebateReturnFactory(1d, 300, 200);
                break;
            case 5: //先打8折 再满300返回100
                fs = new CashReturnRebateFactory(0.8d, 300d, 100d);
                break;
            case 6: //先满减200返50 再打7折
                fs = new CashReturnRebateFactory(0.7d, 200d, 50d);
                break;
        }
        assert fs != null;
        this.cs = fs.createSalesModel();
    }

    public double getResult(double price, int num) {
        /* 根据策略不同，获取计算结果 */
        return this.cs.acceptCash(price, num);
    }
}
