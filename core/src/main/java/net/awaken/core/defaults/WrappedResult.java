package net.awaken.core.defaults;

import net.awaken.core.Wrapped;

/**
 * @param <T> Result
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class WrappedResult<T> extends SuccessfulResult implements Wrapped<T> {

    public WrappedResult(T result) {
        super();
        this.result = result;
    }

    private T result;

    @Override
    public boolean wrapped() {
        return true;
    }

    @Override
    public T getWrapped() {
        return this.result;
    }
}
