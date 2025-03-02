package com.design.builder;

/**
 * @author jzwu
 * @since 2024-09-18
 */
public class ConcreteBuilder1 extends Builder {
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
