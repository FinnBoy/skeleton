package net.awaken.core.linq.bean;

import net.awaken.core.linq.Pipe;

/**
 * a property of the element used for sorting.
 *
 * @param <Bean> the type of the element
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Order<Bean> {

    /**
     * serial number used for sorting.
     *
     * @return serial number
     */
    int serial();

    /**
     * ascending or descending.
     *
     * @return direction
     * @see Pipe.Direction
     */
    Pipe.Direction direction();

    /**
     * return property of bean, which wrapped field info.
     *
     * @return property
     * @see Property
     */
    Property<Bean> prop();

}
