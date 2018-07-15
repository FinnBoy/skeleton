package net.awaken.core.linq;

/**
 * @param <T>
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Struct<T> {

    /**
     * @param field element's field
     * @return property wrapper
     */
    Property<T> of(Object field);

    /**
     * @return the proxy of element
     */
    T proxy();
}
