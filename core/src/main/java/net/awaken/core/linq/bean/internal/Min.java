package net.awaken.core.linq.bean.internal;

/**
 * @param <T> the type of the element
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018(1.5)
 */
public class Min<T extends Comparable> extends AggregatorBase<T> {

    private T value;

    @Override
    public void execute(T val) {
        if (value != null && value.compareTo(val) > 0) {
            value = val;
        } else if (value == null) {
            value = val;
        }
    }

    @Override
    public T get() {
        return value;
    }
}
