package com.design.mediator.two;

/**
 * 具体中介者类
 *
 * @author jzwu
 * @since 2024-02-21
 */
public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 value) {
        this.colleague1 = value;
    }

    public void setColleague2(ConcreteColleague2 value) {
        this.colleague2 = value;
    }


    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.notify(message);
        } else {
            colleague1.notify(message);
        }
    }
}
