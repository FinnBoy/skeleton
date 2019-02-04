package net.awaken.core.infrastructure.network.db;

import java.io.Serializable;
import java.util.List;

/**
 * DB Common Access API.
 * <p>
 * thread-safe
 * </p>
 *
 * @author Finn Zhao
 */
public interface DataStore {

    void save(Entity persistent) throws DatabaseException;

    void update(Entity persistent) throws DatabaseException;

    void delete(Entity persistent) throws DatabaseException;

    boolean saveSilently(Entity persistent) throws DatabaseException;

    boolean updateSilently(Entity persistent) throws DatabaseException;

    boolean deleteSilently(Entity persistent) throws DatabaseException;

    <T extends Entity> T load(Class<T> clazz, Serializable id) throws DatabaseException;

    <T extends Entity> T get(Class<T> clazz, Serializable id) throws DatabaseException;

    <T extends Entity> T single(Class<T> clazz, Criteria criteria) throws DatabaseException;

    <E extends Entity> List<E> list(Class<E> clazz, Criteria criteria) throws DatabaseException;

    int execute(String namedStatement) throws DatabaseException;

    int execute(String namedStatement, Criteria criteria) throws DatabaseException;

    String literal(String namedStatement, Criteria criteria) throws DatabaseException;

    <T extends Number> T numeric(String namedStatement, Criteria criteria) throws DatabaseException;

    <T extends Record> T seek(String namedStatement, Criteria criteria) throws DatabaseException;

    <E extends Record> List<E> query(String namedStatement, Criteria criteria) throws DatabaseException;

}
