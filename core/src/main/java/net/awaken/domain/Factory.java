package net.awaken.domain;

/**
 * Entity Factory.
 */
public interface Factory<T extends Entity> {

    T create(Criteria criteria);

    T reconstitute();
}
