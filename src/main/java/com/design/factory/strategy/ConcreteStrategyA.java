package com.design.factory.strategy;

/**
 * @author jzwu
 * @since 2024-08-07
 */
public class ConcreteStrategyA extends Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("A算法实现");
    }
}
