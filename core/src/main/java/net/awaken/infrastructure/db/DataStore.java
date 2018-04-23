package net.awaken.infrastructure.db;

import net.awaken.infrastructure.Identifiable;

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
public interface DataStore extends Identifiable {

    <ID extends Serializable, T extends Persistent<ID>> ID save(T persistent) throws DataException;

    void alter(Data persistent) throws DataException;

    void drop(Data persistent) throws DataException;

    boolean insert(Data persistent) throws DataException;

    boolean update(Data persistent) throws DataException;

    boolean delete(Data persistent) throws DataException;

    int execute(String namedStatement) throws DataException;

    int execute(String namedStatement, Restriction restriction) throws DataException;

    <T extends Data> T load(Class<T> clazz, Serializable id) throws DataException;

    <T extends Data> T get(Class<T> clazz, Serializable id) throws DataException;

    <T extends Data> T single(Class<T> clazz, Restriction restriction) throws DataException;

    <E extends Data> List<E> list(Class<E> clazz, Restriction restriction) throws DataException;

    <E extends Data> List<E> list(Class<E> clazz, Restriction restriction, RowBounds rowBounds) throws DataException;

    <E extends Result> List<E> query(String namedStatement, Class<E> clazz, Restriction restriction) throws DataException;

    <E extends Result> List<E> query(String namedStatement, Class<E> clazz, Restriction restriction, RowBounds rowBounds)
            throws DataException;

    <T extends Result> T seek(String namedStatement, Class<T> clazz, Restriction restriction) throws DataException;

    <T extends Number> T numeric(String namedStatement, Class<T> clazz, Restriction restriction) throws DataException;

    String literal(String namedStatement, Restriction restriction) throws DataException;

}
