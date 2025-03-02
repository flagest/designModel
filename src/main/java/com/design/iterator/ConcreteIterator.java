package com.design.iterator;

/**
 * @author jzwu
 * @since 2024-11-27
 */
public class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getCurrentItem(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < aggregate.getCount()) {
            ret = aggregate.getCurrentItem(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getCount() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getCurrentItem(current);
    }
}
