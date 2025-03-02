package com.design.backup;

/**
 * @author jzwu
 * @since 2024-11-02
 */
public class Run {
    public static void main(String[] args) {
        /* 初始状态为 on */
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("off");
        originator.show();

        originator.recoveryMemento(caretaker.getMemento());
        originator.show();
    }
}
