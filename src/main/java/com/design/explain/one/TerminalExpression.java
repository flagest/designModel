package com.design.explain.one;

/**
 * @author jzwu
 * @since 2024-03-03
 */
public class TerminalExpression extends  AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
