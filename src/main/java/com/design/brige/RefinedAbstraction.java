package com.design.brige;

/**
 * @author jzwu
 * @since 2025-02-19
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        System.out.println("具体的Abstraction");
        implementor.operation();
    }
}
