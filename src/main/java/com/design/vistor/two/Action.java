package com.design.vistor.two;

import com.design.vistor.one.Man;
import com.design.vistor.one.Woman;

/**
 * @author jzwu
 * @since 2024-03-13
 */
public abstract class Action {
    public abstract void getManConclusion(Man concreteElement);

    public abstract void getWomanConclusion(Woman concreteElement);

}
