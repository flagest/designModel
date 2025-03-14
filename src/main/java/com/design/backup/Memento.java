package com.design.backup;

/**
 * @author jzwu
 * @since 2024-11-01
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state=state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
