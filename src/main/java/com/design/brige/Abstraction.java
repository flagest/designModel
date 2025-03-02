package com.design.brige;

/**
 * @author jzwu
 * @since 2025-02-19
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public abstract void operation();
    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}
