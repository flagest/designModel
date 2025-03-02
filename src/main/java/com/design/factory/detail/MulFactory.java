package com.design.factory.detail;

import com.design.factory.Mul;
import com.design.factory.Operation;

/**
 * @author jzwu
 * @since 2024-07-25
 */
public class MulFactory implements IFactory{
    @Override
    public Operation createOperate() {
        return new Mul();
    }
}
