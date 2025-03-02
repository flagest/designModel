package com.design.template;

/**
 * @author jzwu
 * @since 2024-09-09
 */
public abstract class AbstractClass {
    public void templateMethod() {
        this.primitiveOperation1();
        this.primitiveOperation2();
    }

    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();
}
