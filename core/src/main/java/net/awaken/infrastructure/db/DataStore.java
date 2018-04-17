package net.awaken.infrastructure.db;

import java.io.Serializable;
import java.util.List;

/**
 * DB Common Access API.
 */
public interface DataStore {

    void save(Data persistent);

    void update(Data persistent);

    void delete(Data persistent);

    <T extends Data> T load(Class<T> clazz, Serializable id);

    <T extends Data> T get(Class<T> clazz, Serializable id);

    <T extends Data> T single(Class<T> clazz, Restriction restriction);

    <T extends Data> List<T> list(Class<T> clazz, Restriction restriction);

    <T extends Result> List<T> query(Class<T> clazz, Restriction restriction);

    <T extends Result> T seek(Class<T> clazz, Restriction restriction);

    <T extends Number> T numeric(Class<T> clazz, Restriction restriction);

    String literal(Restriction restriction);
}
