package com.design.brige;

/**
 * @author jzwu
 * @since 2025-02-19
 */
public class Run {
    public static void main(String[] args) {
        Abstraction ab;
        ab=new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();
        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
