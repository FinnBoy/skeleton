package net.awaken.core.linq.operation;

import net.awaken.core.linq.Pipe;

/**
 * @param <Bean>
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018(1.5)
 */
public interface Sort<Bean> {

    /**
     * @param field  element's field
     * @param serial order index
     * @return self
     */
    Sort<Bean> by(Object field, int serial);

    /**
     * @param field     element's field
     * @param serial    order index
     * @param direction order direction
     * @return self
     */
    Sort<Bean> by(Object field, int serial, Pipe.Direction direction);

}
