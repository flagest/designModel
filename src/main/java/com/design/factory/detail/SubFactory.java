package com.design.factory.detail;

import com.design.factory.Operation;
import com.design.factory.Sub;

/**
 * @author jzwu
 * @since 2024-07-25
 */
public class SubFactory implements IFactory{
    @Override
    public Operation createOperate() {
        return new Sub();
    }
}
