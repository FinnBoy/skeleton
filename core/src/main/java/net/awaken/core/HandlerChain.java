package net.awaken.core;

/**
 * Interface for a chain of responsibility that executes logic by which consists of {@link Handler}.
 * <p>
 * <b>no thread-safe guaranteed, depends on implementation.</b>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface HandlerChain {

    int getHandlerSize();

    void proceed(Dispatcher dispatcher);

    Result start(Criteria criteria);

}
