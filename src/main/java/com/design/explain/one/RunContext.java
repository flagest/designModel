package com.design.explain.one;

import java.util.ArrayList;

/**
 * @author jzwu
 * @since 2024-03-03
 */
public class RunContext {
    public static void main(String[] args) {
        Context context = new Context();
        ArrayList<AbstractExpression> arrayList = new ArrayList<>(16);
        arrayList.add(new TerminalExpression());
        arrayList.add(new NonterminalExpression());
        arrayList.add(new TerminalExpression());
        arrayList.add(new TerminalExpression());
        for (AbstractExpression abstractExpression : arrayList) {
            abstractExpression.interpret(context);
        }
    }
}
