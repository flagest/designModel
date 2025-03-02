package com.design.vistor.one;

/**
 * @author jzwu
 * @since 2024-03-09
 */
public abstract class Person {
    protected String action;

    public String getAction() {
        return this.action;
    }

    public String setAction(String action) {
        return this.action = action;
    }
    public abstract void getConclusion();
}
