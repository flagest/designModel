package com.design.builder;

import java.awt.*;

/**
 * @author jzwu
 * @since 2024-09-16
 */
public abstract class PersonBuilder {
    protected Graphics graphics;

    public PersonBuilder(Graphics graphics) {
        this.graphics = graphics;
    }
    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();

}
