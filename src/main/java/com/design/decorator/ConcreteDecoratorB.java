package com.design.decorator;

/**
 * @author jzwu
 * @since 2024-08-11
 */
public class ConcreteDecoratorB extends Decorator {
    public void operation() {
        super.operation();
        this.addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("具体装饰对象B的独有操作");
    }
}
