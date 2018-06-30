package net.awaken.core.defaults;

import net.awaken.core.*;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public abstract class HandlerChainBase implements HandlerChain {

    protected Handler[] handlers;

    @Override
    public int getHandlerSize() {
        return this.handlers == null ? 0 : this.handlers.length;
    }

    public void setHandlers(Handler[] handlers) {
        this.handlers = handlers;
    }

    abstract protected Dispatcher createDispatcher(Criteria criteria);
}
