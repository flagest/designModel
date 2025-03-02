package com.design.factory.detail;

import com.design.factory.Div;
import com.design.factory.Operation;

/**
 * @author jzwu
 * @since 2024-07-25
 */
public class DivFactory implements IFactory{
    @Override
    public Operation createOperate() {
        return new Div();
    }
}
