package com.design.decorator;

/**
 * @author jzwu
 * @since 2024-08-11
 */
public class RunDecorator {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }
}
