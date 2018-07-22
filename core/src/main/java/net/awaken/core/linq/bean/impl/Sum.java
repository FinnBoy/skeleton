package net.awaken.core.linq.bean.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @param <T> the type of the element
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018(1.5)
 */
public class Sum<T extends Number> extends AggregatorBase<T> {

    private BigDecimal sum = BigDecimal.ZERO;

    private T value;

    @Override
    public void execute(T val) {
        if (val != null) {
            sum = sum.add(new BigDecimal(val.doubleValue()));
        }
        if (val != null) {
            value = val;
        }
    }

    @Override
    public T get() {
        return get(sum());
    }

    protected BigDecimal sum() {
        return sum;
    }

    protected T get(BigDecimal v) {
        if (value instanceof BigDecimal) {
            return (T) v;
        } else if (value instanceof BigInteger) {
            return (T) BigInteger.valueOf(v.longValue());
        } else if (value instanceof Byte) {
            return (T) Byte.valueOf(v.byteValue());
        } else if (value instanceof Short) {
            return (T) Short.valueOf(v.shortValue());
        } else if (value instanceof Integer) {
            return (T) Integer.valueOf(v.intValue());
        } else if (value instanceof Long) {
            return (T) Long.valueOf(v.longValue());
        } else if (value instanceof Float) {
            return (T) Float.valueOf(v.floatValue());
        } else if (value instanceof Double) {
            return (T) Double.valueOf(v.doubleValue());
        }
        return null;
    }

}
