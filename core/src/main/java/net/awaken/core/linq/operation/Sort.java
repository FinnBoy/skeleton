package net.awaken.core.linq.operation;

import net.awaken.core.linq.constant.Direction;

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
    Sort<Bean> by(Object field, int serial, Direction direction);

    Sort<Bean> by(byte field, int serial);

    Sort<Bean> by(char field, int serial);

    Sort<Bean> by(short field, int serial);

    Sort<Bean> by(int field, int serial);

    Sort<Bean> by(long field, int serial);

    Sort<Bean> by(float field, int serial);

    Sort<Bean> by(double field, int serial);

    Sort<Bean> by(boolean field, int serial);

    Sort<Bean> by(byte field, int serial, Direction direction);

    Sort<Bean> by(char field, int serial, Direction direction);

    Sort<Bean> by(short field, int serial, Direction direction);

    Sort<Bean> by(int field, int serial, Direction direction);

    Sort<Bean> by(long field, int serial, Direction direction);

    Sort<Bean> by(float field, int serial, Direction direction);

    Sort<Bean> by(double field, int serial, Direction direction);

    Sort<Bean> by(boolean field, int serial, Direction direction);

}
