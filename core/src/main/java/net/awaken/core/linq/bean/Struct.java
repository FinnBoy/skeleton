package net.awaken.core.linq.bean;

import net.awaken.core.linq.operation.Group;
import net.awaken.core.linq.operation.Join;
import net.awaken.core.linq.operation.Sort;
import net.awaken.core.linq.operation.Union;

/**
 * @param <Bean>
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Struct<Bean> {

    /**
     * Grouping Operation.
     *
     * @return Group
     * @see Group
     */
    Group<Bean> group();

    /**
     * Sorting Operation.
     *
     * @return Sort
     * @see Sort
     */
    Sort<Bean> sort();

    /**
     * Union Operation.
     *
     * @param bean         type of object
     * @param <Additional> object as a record
     * @return Union
     * @see Union
     */
    <Additional> Union<Bean, Additional> union(Class<Additional> bean);

    /**
     * Union Operation.
     *
     * @param struct       struct of object
     * @param <Additional> struct of object
     * @return Union
     * @see Union
     */
    <Additional> Union<Bean, Additional> union(Struct<Additional> struct);

    /**
     * Join Operation.
     *
     * @param bean         type of object
     * @param <Additional> object as a record
     * @return Join
     * @see Join
     */
    <Additional> Join<Bean, Additional> join(Class<Additional> bean);

    /**
     * Join Operation.
     *
     * @param struct       struct of object
     * @param <Additional> struct of object
     * @return Join
     * @see Join
     */
    <Additional> Join<Bean, Additional> join(Struct<Additional> struct);

    /**
     * @return the proxy of element
     */
    Bean get();

    /**
     * @param field element's field
     * @return property wrapper
     */
    Property<Bean> get(Object field);

    Property<Bean> get(byte field);

    Property<Bean> get(char field);

    Property<Bean> get(short field);

    Property<Bean> get(int field);

    Property<Bean> get(long field);

    Property<Bean> get(float field);

    Property<Bean> get(double field);

    Property<Bean> get(boolean field);

}
