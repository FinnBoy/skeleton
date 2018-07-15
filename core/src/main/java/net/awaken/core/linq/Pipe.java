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

    interface Joining<Main, Additional> {

        Main main();

        Additional additional();

        Joining<Main, Additional> on(Object mainField, Object additionalField);

        Joining<Main, Additional> configure();

        boolean configured();

        Joining<Main, Additional> append(Collection<Additional> additional);

        Joining<Main, Additional> append(Collection<Main> main, Collection<Additional> additional);

        <Result> Pipe<Result> map(Integration<Main, Additional, Result> integration);

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

    /**
     * a property of the element used for sorting.
     *
     * @param <T> the type of the element
     */
    interface Order<T> {

        int serial();

        Direction direction();

        Object field();
    }

    /**
     * handle with the datas of two types, and set result to a new type.
     *
     * @param <Main>
     * @param <Additional>
     * @param <Result>
     */
    interface Integration<Main, Additional, Result> {
        Result merge(Main main, Additional additional);
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
