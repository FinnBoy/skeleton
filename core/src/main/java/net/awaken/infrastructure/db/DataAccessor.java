package net.awaken.infrastructure.db;

import java.io.Serializable;
import java.util.List;

/**
 * DB Data Access Object interface.
 *
 * @param <K> ID
 * @param <T> Table
 * @author Finn Zhao
 */
public interface DataAccessor<K extends Serializable, T extends Persistent<K>> {

    K save(T persistent) throws DataException;

    void alter(T persistent) throws DataException;

    void drop(T persistent) throws DataException;

    boolean insert(T persistent) throws DataException;

    boolean update(T persistent) throws DataException;

    boolean delete(T persistent) throws DataException;

    T load(K id) throws DataException;

    T get(K id) throws DataException;

    T single(Restriction restriction) throws DataException;

    List<T> list(Restriction restriction) throws DataException;

    List<T> list(Restriction restriction, RowBounds rowBounds) throws DataException;

}
