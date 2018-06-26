package net.awaken.core.defaults;

import net.awaken.core.Dispatcher;
import net.awaken.core.Handler;
import net.awaken.core.HandlerCriteria;
import net.awaken.core.HandlerResult;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class DefaultHandlerChain extends HandlerChainBase {

    public DefaultHandlerChain() {
        this.setDispatcherFactory(new DefaultDispatcherFactory());
    }

    @Override
    public void proceed(Dispatcher dispatcher) {
        int size = this.getHandlerSize();
        if (size == 0) {
            return;
        }
        int counter = dispatcher.getHandlerCounter();
        if (counter >= size) {
            // TODO: set result, failed handling.
            dispatcher.setResult(UnsolvedResult.INSTANCE);
            return;
        }
        Handler handler = this.handlers[counter];
        dispatcher.increase(this);
        handler.handle(dispatcher, this);
    }

    @Override
    public HandlerResult start(HandlerCriteria criteria) {
        Dispatcher dispatcher = this.createDispatcher(criteria);
        this.proceed(dispatcher);
        return dispatcher.getResult();
    }

}
