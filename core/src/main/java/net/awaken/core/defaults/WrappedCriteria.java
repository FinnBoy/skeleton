package net.awaken.core.defaults;

import net.awaken.core.HandlerCriteria;
import net.awaken.core.Wrapped;

/**
 * @param <T> Criteria
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class WrappedCriteria<T> implements HandlerCriteria, Wrapped<T> {

    public WrappedCriteria(T criteria) {
        this.criteria = criteria;
    }

    private T criteria;

    @Override
    public boolean wrapped() {
        return true;
    }

    @Override
    public T getWrapped() {
        return this.criteria;
    }
}
