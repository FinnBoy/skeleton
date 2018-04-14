package net.awaken.domain;

import java.io.Serializable;
import java.util.Set;

/**
 * Entity Repository.
 */
public interface Repository<S extends Serializable, T extends Entity<S>> {

    T get(S id);

    Set<T> selectSatisfying(Criteria criteria);

    void save(T entity);

    void discard(T entity);

    void modify(T entity);
}
