package com.design.adapter;

/**
 * @author jzwu
 * @since 2024-10-30
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    // 进攻
    public abstract void attack();

    // 防守
    public abstract void define();

}
