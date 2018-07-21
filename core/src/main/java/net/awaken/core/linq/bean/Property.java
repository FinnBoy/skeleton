package net.awaken.core.linq.bean;

/**
 * @param <Bean>
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Property<Bean> {

    /**
     * a Proxy Class of the Generic, which can return the property info while using Getter.
     *
     * @return Proxy of the Generic
     */
    Bean bean();

    /**
     * @return struct object of the bean
     * @see Struct
     */
    Struct<Bean> struct();

    /**
     * @return the field name
     */
    String name();

    /**
     * @return the field type
     */
    Class<?> type();
}
