package com.design.builder;

import java.awt.*;

/**
 * @author jzwu
 * @since 2024-09-16
 */
public class PersonThinBuilder extends PersonBuilder {
    public PersonThinBuilder(Graphics g) {
        super(g);
    }

    @Override
    public void buildHead() {
        graphics.drawOval(10, 50, 30, 30);
    }

    @Override
    public void buildBody() {
        graphics.drawRect(20, 80, 100, 50);
    }

    @Override
    public void buildArmLeft() {
        graphics.drawLine(50, 140, 30, 200);
    }

    @Override
    public void buildArmRight() {
        graphics.drawLine(150, 140, 170, 200);
    }

    @Override
    public void buildLegLeft() {
        graphics.drawLine(50, 210, 30, 270);
    }

    @Override
    public void buildLegRight() {
        graphics.drawLine(150, 210, 170, 270);
    }
}
