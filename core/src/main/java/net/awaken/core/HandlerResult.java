package net.awaken.core;

/**
 * Interface for handling Result.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface HandlerResult extends Bean {

    int S_UNSOLVED = 0;

    int S_HANDLING = 1;

    int S_SUCCESS = 2;

    int S_FAILURE = 3;

    int status();

}
