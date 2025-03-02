package com.design.factory.detail;

import com.design.factory.Add;
import com.design.factory.Operation;

/**
 * @author jzwu
 * @since 2024-07-25
 */
public class AddFactory implements IFactory{
    @Override
    public Operation createOperate() {
        return new Add();
    }
}
