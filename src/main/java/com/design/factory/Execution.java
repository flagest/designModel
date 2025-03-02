package com.design.factory;

/**
 * @author jzwu
 * @since 2024-07-07
 */
public class Execution {
    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("-");
        double result = operate.getResult(2, 1);
        System.out.println(result);
    }
}
