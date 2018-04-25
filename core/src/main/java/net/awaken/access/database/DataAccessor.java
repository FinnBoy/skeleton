package net.awaken.access.database;

import net.awaken.access.database.bean.DataBag;
import net.awaken.access.database.bean.Persistent;
import net.awaken.access.database.bean.Restriction;

import java.io.Serializable;

/**
 * DB Data Access Object interface.
 *
 * @param <K> ID
 * @param <T> Table
 * @author Finn Zhao
 */
public interface DataAccessor<K extends Serializable, T extends Persistent<K>> {

    K save(T persistent);

    void alter(T persistent);

    void drop(T persistent);

    boolean insert(T persistent);

    boolean update(T persistent);

    boolean delete(T persistent);

    T load(K id);

    T get(K id);

    T single(Restriction restriction);

    DataBag<T> list(Restriction restriction);
}
