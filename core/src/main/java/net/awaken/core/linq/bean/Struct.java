package net.awaken.core.linq.bean;

import net.awaken.core.linq.Pipe;

/**
 * @param <Bean>
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Struct<Bean> {

    /**
     * @param field element's field
     * @return property wrapper
     */
    Property<Bean> of(Object field);

    /**
     * @param field element's field
     * @return property wrapper
     */
    <F> Aggregation<Bean, F> of(Object field, Aggregator<F> aggregator);

    /**
     * @param field element's field
     * @return property order
     */
    Order<Bean> of(Object field, int serial);

    /**
     * @param field element's field
     * @return property order
     */
    Order<Bean> of(Object field, int serial, Pipe.Direction direction);

    /**
     * @return the proxy of element
     */
    Bean get();
}
