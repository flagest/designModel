package com.design.state;

/**
 * @author jzwu
 * @since 2024-10-19
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
