package net.awaken.infrastructure.db;

import java.io.Serializable;
import java.util.List;

public interface DataStore {

    void save(Persistent persistent);

    void update(Persistent persistent);

    void delete(Persistent persistent);

    <T extends Persistent> T load(Class<T> clazz, Serializable id);

    <T extends Persistent> T get(Class<T> clazz, Serializable id);

    <T extends Persistent> T single(Class<T> clazz, Restriction restriction);

    <T extends Persistent> List<T> list(Class<T> clazz, Restriction restriction);

    <T extends Result> List<T> query(Class<T> clazz, Restriction restriction);

    <T extends Result> T seek(Class<T> clazz, Restriction restriction);

    <T extends Number> T numeric(Class<T> clazz, Restriction restriction);

    String literal(Restriction restriction);
}
