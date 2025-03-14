package com.design.composite;

/**
 * @author jzwu
 * @since 2024-11-03
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);

}

