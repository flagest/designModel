package com.design.factory.detail;

import com.design.factory.Operation;

/**
 * @author jzwu
 * @since 2024-07-26
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation oper = null;
        IFactory factory = null;
        switch (operate) {
            case "+":
                factory=new AddFactory();
                break;
            case "-":
                factory=new SubFactory();
                break;
            case "*":
                factory=new MulFactory();
                break;
            case "/":
                factory=new DivFactory();
                break;
        }
         oper = factory.createOperate();
        return oper;
    }
}
