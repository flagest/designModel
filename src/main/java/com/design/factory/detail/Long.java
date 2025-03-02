package com.design.factory.detail;

import com.design.factory.Operation;

/**
 * @author jzwu
 * @since 2024-07-27
 */
public class Long extends Operation {
    public double getResult(long number1, long number2) {
      return  Math.log(number1)/Math.log(number2);
    }

}
