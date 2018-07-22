package net.awaken.core.linq.bean.impl;

import net.awaken.core.linq.bean.Aggregator;

/**
 * @param <T> the type of the element
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018(1.5)
 */
public abstract class AggregatorBase<T> implements Aggregator<T> {

    private int count = 0;

    @Override
    public void process(T value) {
        count += 1;
        this.execute(value);
    }

    @Override
    public int count() {
        return count;
    }

    protected abstract void execute(T value);
}
