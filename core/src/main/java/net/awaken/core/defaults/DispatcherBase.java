package net.awaken.core.defaults;

import net.awaken.core.Dispatcher;
import net.awaken.core.HandlerChain;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public abstract class DispatcherBase implements Dispatcher {

    private int counter = 0;

    @Override
    public int getHandlerCounter() {
        return counter;
    }

    @Override
    public void increase(HandlerChain chain) {
        if (chain == null) {
            return;
        }
        // TODO: others validation with chain.
        counter += 1;
    }

}
