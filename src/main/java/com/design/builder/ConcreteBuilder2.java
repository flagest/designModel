package com.design.builder;

/**
 * @author jzwu
 * @since 2024-09-18
 */
public class ConcreteBuilder2 extends Builder {
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件Y");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
