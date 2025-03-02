package com.design.decorator.yifu;

/**
 * @author jzwu
 * @since 2024-08-15
 */
public class Finery implements ICharacter {
    protected ICharacter component;

    public void decorate(ICharacter component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (this.component != null) {
            this.component.show();
        }
    }
}
