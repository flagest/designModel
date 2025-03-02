package com.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jzwu
 * @since 2024-11-27
 */
public class ConcreteAggregate extends Aggregate {
    List<Object> items = new ArrayList<Object>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getCount() {
        return this.items.size();
    }

    public void add(Object object) {
        items.add(object);
    }

    public Object getCurrentItem(int index) {
        return items.get(index);
    }
}
