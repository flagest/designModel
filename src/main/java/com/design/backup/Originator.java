package com.design.backup;

/**
 * @author jzwu
 * @since 2024-11-01
 */
public class Originator {
    private String state;

    public void show() {
        System.out.println("State:" + this.state);
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }
    public void recoveryMemento(Memento memento){
        this.setState(memento.getState());
    }



    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
