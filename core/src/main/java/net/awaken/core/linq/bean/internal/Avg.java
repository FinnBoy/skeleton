package net.awaken.core.linq.bean.internal;

import java.math.BigDecimal;

/**
 * @param <T> the type of the element
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018(1.5)
 */
public class Avg<T extends Number> extends Sum<T> {

    @Override
    public T get() {
        if (count() == 0) {
            return null;
        }
        BigDecimal v = sum().divide(BigDecimal.valueOf(count()));
        return get(v);
    }
}
