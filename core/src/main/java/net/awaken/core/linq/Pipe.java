package net.awaken.core.linq;

import java.util.Collection;
import java.util.Comparator;

/**
 * @param <T> the type of the pipe elements
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Pipe<T> {

    /**
     * sort Collection according to the provided {@code Comparator}.
     *
     * @param comparator {@code Comparator} to be used to compare stream elements
     * @return the pipe
     */
    Pipe<T> sort(Comparator<? super T> comparator);

    /**
     * sort Collection according to the provided {@code Order}.
     *
     * @return
     */
    Pipe<T> sort();

    /**
     * a Proxy Class of the Generic, which can return the property info while using Getter.
     *
     * @return Proxy of the Generic
     */
    T structure();

    /**
     * start grouping operation.
     *
     * @return Grouping
     */
    Grouping<T> grouping();

    /**
     * start ordering operation.
     *
     * @return Ordering
     */
    Ordering<T> ordering();

    /**
     * create a complicated data structure with two element types.
     *
     * @param clazz the class of the element
     * @param <E>   the type of the element
     * @return Joining
     */
    <E> Joining<T, E> joining(Class<E> clazz);

    /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Inner Interface ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

    interface Joining<T, E> {

        T main();

        E additional();

        Joining<T, E> on(Object mainField, Object additionalField);

        Joining<T, E> configure();

        boolean configured();

        Joining<T, E> append(Collection<E> additional);

        Joining<T, E> append(Collection<T> main, Collection<E> additional);

        <R> Pipe<R> map(Integration<T, E, R> integration);

    }

    interface Integration<T, E, R> {
        R merge(T main, E additional);
    }

    interface Grouping<T> {

        Grouping<T> groupBy(Object field);

        Grouping<T> aggregate(Object field);

        void done();
    }

    interface Ordering<T> {

        Ordering<T> add(Order<T> order);

        void done();
    }

    interface Order<T> {

        int serial();

        Direction direction();

        Object field();
    }

    /**
     * Sorting Direction: ascending or descending.
     */
    enum Direction {
        ascending(0),
        descending(1);

        private int direction;

        Direction(int direction) {
            this.direction = direction;
        }

        public int val() {
            return this.direction;
        }

        public boolean isSame(Direction direction) {
            return this.direction == direction.val();
        }
    }
}
