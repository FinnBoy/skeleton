package net.awaken.infrastructure.db;

import java.io.Serializable;
import java.util.List;

/**
 * @param <K> ID
 * @param <T> Table
 * @author Finn Zhao
 */
public abstract class DataAccessorBase<K extends Serializable, T extends Persistent<K>> implements DataAccessor<K, T> {

    private DataStore dataStore;

    @Override
    public K save(T persistent) throws DataException {
        return this.dataStore.save(persistent);
    }

    @Override
    public void alter(T persistent) throws DataException {
        this.dataStore.alter(persistent);
    }

    @Override
    public void drop(T persistent) throws DataException {
        this.dataStore.drop(persistent);
    }

    @Override
    public boolean insert(T persistent) throws DataException {
        return this.dataStore.insert(persistent);
    }

    @Override
    public boolean update(T persistent) throws DataException {
        return this.dataStore.update(persistent);
    }

    @Override
    public boolean delete(T persistent) throws DataException {
        return this.dataStore.delete(persistent);
    }

    @Override
    public T load(K id) throws DataException {
        return this.dataStore.load(this.getPersistentClass(), id);
    }

    @Override
    public T get(K id) throws DataException {
        return this.dataStore.get(this.getPersistentClass(), id);
    }

    @Override
    public T single(Restriction restriction) throws DataException {
        return this.dataStore.single(this.getPersistentClass(), restriction);
    }

    @Override
    public List<T> list(Restriction restriction) throws DataException {
        return this.dataStore.list(this.getPersistentClass(), restriction);
    }

    @Override
    public List<T> list(Restriction restriction, RowBounds rowBounds) throws DataException {
        return this.dataStore.list(this.getPersistentClass(), restriction, rowBounds);
    }

    abstract Class<T> getPersistentClass();

    public void setDataStore(DataStore dataStore) {
        this.dataStore = dataStore;
    }
}
