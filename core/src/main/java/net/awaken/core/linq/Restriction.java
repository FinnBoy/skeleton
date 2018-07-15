package net.awaken.core.linq;

/**
 * @param <T>
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Restriction<T> {

    /**
     * @param t element
     * @return true when the element is satisfied.
     */
    boolean test(T t);
}
