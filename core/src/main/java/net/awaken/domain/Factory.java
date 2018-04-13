package net.awaken.domain;

/**
 * Entity Factory.
 */
public interface Factory<T extends Entity> {

    T create();

    T reconstitute();
}
