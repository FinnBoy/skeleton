package net.awaken.access.database;

import net.awaken.access.database.bean.*;

import java.io.Serializable;

/**
 * DB Common Access API.
 * <p>
 * thread-safe
 * </p>
 *
 * @author Finn Zhao
 */
public interface DataStore extends LifeCycle {

    <ID extends Serializable, T extends Persistent<ID>> ID save(T persistent);

    void alter(Record persistent);

    void drop(Record persistent);

    boolean insert(Record persistent);

    boolean update(Record persistent);

    boolean delete(Record persistent);

    int execute(String namedStatement);

    int execute(String namedStatement, Restriction restriction);

    <T extends Record> T load(Class<T> clazz, Serializable id);

    <T extends Record> T get(Class<T> clazz, Serializable id);

    <T extends Record> T single(Class<T> clazz, Restriction restriction);

    <E extends Record> DataBag<E> list(Class<E> clazz, Restriction restriction);

    <E extends Result> DataBag<E> query(String namedStatement, Class<E> clazz, Restriction restriction);

    <T extends Result> T seek(String namedStatement, Class<T> clazz, Restriction restriction);

    <T extends Number> T numeric(String namedStatement, Class<T> clazz, Restriction restriction);

    String literal(String namedStatement, Restriction restriction);

}
