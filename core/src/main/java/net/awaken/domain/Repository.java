package net.awaken.domain;

import java.io.Serializable;
import java.util.Set;

/**
 * Entity Repository.
 */
public interface Repository<T extends Entity> {

    T get(Serializable id);

    Set<T> selectSatisfying(Criteria criteria);
}
