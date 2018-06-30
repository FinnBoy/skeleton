package net.awaken.core.defaults;

import net.awaken.core.Dispatcher;
import net.awaken.core.Handler;
import net.awaken.core.Criteria;
import net.awaken.core.Result;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class DefaultHandlerChain extends HandlerChainBase {

    @Override
    public void proceed(Dispatcher dispatcher) {
        int size = this.getHandlerSize();
        if (size == 0) {
            return;
        }
        int counter = dispatcher.getHandlerCounter();
        if (counter >= size) {
            // TODO: set result, failed handling.
            return;
        }
        Handler handler = this.handlers[counter];
        dispatcher.increase(this);
        handler.handle(dispatcher, this);
    }

    @Override
    public Result start(Criteria criteria) {
        Dispatcher dispatcher = this.createDispatcher(criteria);
        this.proceed(dispatcher);
        return dispatcher.getResult();
    }

    @Override
    protected Dispatcher createDispatcher(Criteria criteria) {
        return new DefaultDispatcher(criteria);
    }
}
