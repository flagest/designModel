package com.design.observer;

import java.util.Observable;

/**
 * @author jzwu
 * @since 2024-10-01
 */
public class NewBoss extends Observable {
    protected String name;
    private String action;

    public NewBoss(String name) {
        this.name = name;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String value) {
        this.action = action;
        super.setChanged();
        super.notifyObservers();
    }

}
