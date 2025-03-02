package com.design.factory.factorystaragedecotor;

import com.design.decorator.shop.ISale;

/**
 * @author jzwu
 * @since 2024-08-30
 */
public interface IFactory {
    public ISale createSalesModel(); // 创建销售模式
}
