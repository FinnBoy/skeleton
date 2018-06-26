package net.awaken.core;

/**
 * Interface for actual handling logic.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Handler {

    void handle(Dispatcher dispatcher, HandlerChain chain);
}
