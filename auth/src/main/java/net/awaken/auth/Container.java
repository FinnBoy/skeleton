package net.awaken.auth;

import java.io.Serializable;
import java.util.Set;

/**
 * 容器
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Container<ID extends Serializable, E extends Entry<ID>> {

    /**
     * get privilege details.
     *
     * @return privilege details
     */
    Set<E> getEntries();

    boolean push(E entry);

    E pop(ID id);

    E get(ID id);

    boolean contains(ID id);

    boolean contains(E entry);
}
