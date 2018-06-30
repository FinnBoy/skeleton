package net.awaken.core;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Wrapped {

    Object getWrapped();

    Class<?> getObjectType();

    State.WrappedType getWrappedType();
}
