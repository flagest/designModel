package com.design.decorator.yifu;

/**
 * 人物
 *
 * @author jzwu
 * @since 2024-08-15
 */
public class Person implements ICharacter {
    private String name;

    @Override
    public void show() {
        System.out.println("装扮的" + name);
    }
}
