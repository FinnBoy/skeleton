package net.awaken.core.linq.operation;

import net.awaken.core.linq.bean.Aggregator;

/**
 * @param <Bean>
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018(1.5)
 */
public interface Group<Bean> {

    /**
     * @param field element's field
     * @return self
     */
    Group<Bean> by(Object field);

    /**
     * @param field element's field
     * @return self
     */
    <T> Group<Bean> of(Object field, Aggregator<T> aggregator);

}
