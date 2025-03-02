package com.design.composite;

import org.apache.commons.collections4.functors.ClosureTransformer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jzwu
 * @since 2024-11-03
 */
public class Composite extends Component {
    List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb);
        children.forEach(o -> System.out.println(depth + 2));
    }
}
