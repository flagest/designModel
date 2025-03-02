package com.design.adapter;

/**
 * @author jzwu
 * @since 2024-10-30
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.specificRequest();
    }
}
