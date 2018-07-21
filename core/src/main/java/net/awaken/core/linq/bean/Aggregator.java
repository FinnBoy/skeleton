package net.awaken.core.linq.bean;

/**
 * <p>
 * the wrapper which contains a field of the element, is a strategy interface.
 * </p>
 * <p>
 * a implementation of this interface means a specified aggregate operation while grouping.
 * </p>
 *
 * @param <Field> the type of the element
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Aggregator<Field> {

    Field process(Field value);
}
