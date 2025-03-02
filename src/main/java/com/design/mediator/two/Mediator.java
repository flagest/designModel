package com.design.mediator.two;

/**
 * 抽象中介者类
 *
 * @author jzwu
 * @since 2024-02-21
 */
public abstract class Mediator {
    // 定义发送消息方法，得到同事的消息
    public abstract void send(String message, Colleague colleague);
}
