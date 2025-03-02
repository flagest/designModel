package com.design.builder;

/**
 * @author jzwu
 * @since 2024-09-18
 */
public abstract class Builder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
