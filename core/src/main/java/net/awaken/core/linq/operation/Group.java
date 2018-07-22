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

    Group<Bean> by(byte field);

    Group<Bean> by(char field);

    Group<Bean> by(short field);

    Group<Bean> by(int field);

    Group<Bean> by(long field);

    Group<Bean> by(float field);

    Group<Bean> by(double field);

    Group<Bean> by(boolean field);

    Group<Bean> of(byte field, Aggregator<Byte> aggregator);

    Group<Bean> of(char field, Aggregator<Character> aggregator);

    Group<Bean> of(short field, Aggregator<Short> aggregator);

    Group<Bean> of(int field, Aggregator<Integer> aggregator);

    Group<Bean> of(long field, Aggregator<Long> aggregator);

    Group<Bean> of(float field, Aggregator<Float> aggregator);

    Group<Bean> of(double field, Aggregator<Double> aggregator);

    Group<Bean> of(boolean field, Aggregator<Boolean> aggregator);

}
