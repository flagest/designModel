package com.design.iterator;

/**
 * @author jzwu
 * @since 2024-11-27
 */
public abstract class Iterator {
    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
