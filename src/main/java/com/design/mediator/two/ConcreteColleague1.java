package com.design.mediator.two;

/**
 * @author jzwu
 * @since 2024-02-21
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        this.mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事1得到消息：" + message);
    }
}
