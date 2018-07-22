package net.awaken.core.linq.bean;

/**
 * <p>
 * the wrapper which contains a field of the element, is used for <b>grouping by</b> operation.
 * </p>
 *
 * @param <Bean> the type of the element
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Aggregation<Bean, Field> {

    /**
     * return a kind of operation on the concerned field while grouping.
     *
     * @return a kind of operation
     */
    Aggregator<Field> aggregator();

    /**
     * return property of bean, which wrapped field info.
     *
     * @return property
     * @see Property
     */
    Property<Bean> prop();

}
