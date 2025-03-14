package com.design.mediator.two;

/**
 * @author jzwu
 * @since 2024-02-21
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        this.mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事2得到消息：" + message);
    }
}
