package net.awaken.core.linq;

/**
 * a property of the element used for sorting.
 *
 * @param <T> the type of the element
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Order<T> {

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
     * @see net.awaken.core.linq.Pipe.Direction
     */
    Pipe.Direction direction();

    /**
     * field serial number.
     *
     * @return field index
     * @see Pipe#struct()
     */
    Property<T> prop();
}
