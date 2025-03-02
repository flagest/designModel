package com.design.proxy;

/**
 * @author jzwu
 * @since 2024-08-22
 */
public class Proxy implements IGiveGift {
    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        this.gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        this.gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        this.gg.giveChocolate();
    }
}
