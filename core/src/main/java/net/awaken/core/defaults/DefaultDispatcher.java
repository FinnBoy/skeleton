package net.awaken.core.defaults;

import net.awaken.core.HandlerCriteria;
import net.awaken.core.HandlerResult;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class DefaultDispatcher extends DispatcherBase {

    DefaultDispatcher(HandlerCriteria criteria) {
        this.criteria = criteria;
    }

    private HandlerCriteria criteria;

    private HandlerResult result;

    @Override
    public HandlerCriteria getCriteria() {
        return criteria;
    }

    @Override
    public HandlerResult getResult() {
        return result;
    }

    @Override
    public void setResult(HandlerResult result) {
        this.result = result;
    }
}
