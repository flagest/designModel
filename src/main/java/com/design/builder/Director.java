package com.design.builder;

/**
 * @author jzwu
 * @since 2024-09-18
 */
public class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
