package com.design.state;

/**
 * @author jzwu
 * @since 2024-10-19
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        this.state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态为：" + this.getClass().getName());
    }
}
