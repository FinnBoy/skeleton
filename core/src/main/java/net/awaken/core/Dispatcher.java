package net.awaken.core;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Dispatcher {

    int getHandlerCounter();

    /**
     * increase counter.
     *
     * @see #getHandlerCounter()
     */
    void increase(HandlerChain chain);

    Criteria getCriteria();

    Result getResult();

    <T> void wrapResult(T result);

    void setResult(Result result);
}
