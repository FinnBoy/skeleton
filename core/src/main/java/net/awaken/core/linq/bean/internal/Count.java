package net.awaken.core.linq.bean.internal;

/**
 * @param <T> the type of the element
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018(1.5)
 */
public class Count<T> extends AggregatorBase<T> {

    @Override
    protected void execute(T value) {
    }

    @Override
    public T get() {
        return null;
    }
}
