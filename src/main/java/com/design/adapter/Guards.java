package com.design.adapter;

/**
 * @author jzwu
 * @since 2024-10-30
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋" + this.name + "进攻");
    }

    @Override
    public void define() {
        System.out.println("前锋" + this.name + "防守");
    }
}
