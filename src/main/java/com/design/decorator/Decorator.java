package com.design.decorator;

import java.util.Objects;

/**
 * @author jzwu
 * @since 2024-08-11
 */
public abstract class Decorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    public void operation() {
        if (Objects.nonNull(component)) {
            component.operation();
        }
    }
}
