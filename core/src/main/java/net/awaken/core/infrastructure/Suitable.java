package net.awaken.core.infrastructure;

/**
 * match constant whether true or not.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Suitable {

    boolean match(Integer state);

    Integer state();
}
