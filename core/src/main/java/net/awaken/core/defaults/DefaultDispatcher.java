package net.awaken.core.defaults;

import net.awaken.core.Criteria;
import net.awaken.core.Result;
import net.awaken.core.State;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class DefaultDispatcher extends DispatcherBase {

    DefaultDispatcher(Criteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public <T> void wrapResult(final T result) {
        this.result = new Result() {
            @Override
            public boolean wrapped() {
                return true;
            }

            @Override
            public Object getWrapped() {
                return result;
            }

            @Override
            public Class<?> getObjectType() {
                return result.getClass();
            }

            @Override
            public State.WrappedType getWrappedType() {
                return State.WrappedType.get(result.getClass());
            }
        };
    }

    private Criteria criteria;

    private Result result;

    @Override
    public Criteria getCriteria() {
        return criteria;
    }

    @Override
    public Result getResult() {
        return result;
    }

    @Override
    public void setResult(Result result) {
        this.result = result;
    }
}
