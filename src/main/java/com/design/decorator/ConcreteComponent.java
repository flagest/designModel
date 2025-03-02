package com.design.decorator;

/**
 * @author jzwu
 * @since 2024-08-11
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象实际操作");
    }
}
