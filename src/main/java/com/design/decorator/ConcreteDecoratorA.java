package com.design.decorator;

/**
 * @author jzwu
 * @since 2024-08-11
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    public void operation() {
        super.operation();
        this.addedState = "具体装饰对象A的独有操作";
        System.out.println(this.addedState);
    }
}
