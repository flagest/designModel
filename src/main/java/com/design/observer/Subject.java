package com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jzwu
 * @since 2024-09-28
 */
public abstract class Subject {
    /* 同事列表 */
    private final List<Observer> list = new ArrayList<>();
    protected String name;

    public Subject(String name) {
        this.name = name;
    }

    private String action;

    /* 增加同事（有几个同事需要通知秘书，就增加几个对象） */
    public void attach(Observer observer) {
        list.add(observer);
    }

    /* 减少同事 */
    public void detach(Observer observer) {
        list.remove(observer);
    }

    /* 得到状态 */
    public void notifyEmployee() {
        for (Observer observer : list) {
            observer.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
