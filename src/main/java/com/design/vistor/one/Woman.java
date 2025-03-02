package com.design.vistor.one;

import java.util.Objects;

/**
 * @author jzwu
 * @since 2024-03-09
 */
public class Woman extends Person {
    @Override
    public void getConclusion() {
        if (Objects.equals(action, "成功")) {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，背后大多有一个不成功的男人");
        }
        if (Objects.equals(action, "失败")) {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，泪汪汪，谁也劝不动");
        }
        if (Objects.equals(action, "恋爱")) {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，遇事也装作不懂");
        }
    }
}
