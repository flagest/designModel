package com.design.factory.strategy;

/**
 * @author jzwu
 * @since 2024-08-07
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
