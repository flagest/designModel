package com.design.mediator.two;

/**
 * 抽象同事类
 *
 * @author jzwu
 * @since 2024-02-21
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
