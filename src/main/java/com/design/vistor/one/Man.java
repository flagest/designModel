package com.design.vistor.one;

import java.util.Objects;

/**
 * @author jzwu
 * @since 2024-03-09
 */
public class Man extends Person {
    @Override
    public void getConclusion() {
        if (Objects.equals(action, "成功")) {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，背后多半有一个伟大的女人");
        }
        if (Objects.equals(action, "失败")) {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，闷头喝酒，谁也不用劝");
        }
        if (Objects.equals(action, "恋爱")) {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，凡事不懂也要钻狗洞");
        }
    }
}
