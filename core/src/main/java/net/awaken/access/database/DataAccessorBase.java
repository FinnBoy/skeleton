package net.awaken.access.database;

import net.awaken.access.database.bean.DataBag;
import net.awaken.access.database.bean.Persistent;
import net.awaken.access.database.bean.Restriction;

import java.io.Serializable;

/**
 * @param <K> ID
 * @param <T> Table
 * @author Finn Zhao
 */
public abstract class DataAccessorBase<K extends Serializable, T extends Persistent<K>> implements DataAccessor<K, T> {

    private DataStore dataStore;

    @Override
    public K save(T persistent) {
        return this.dataStore.save(persistent);
    }

    @Override
    public void alter(T persistent) {
        this.dataStore.alter(persistent);
    }

    @Override
    public void drop(T persistent) {
        this.dataStore.drop(persistent);
    }

    @Override
    public boolean insert(T persistent) {
        return this.dataStore.insert(persistent);
    }

    @Override
    public boolean update(T persistent) {
        return this.dataStore.update(persistent);
    }

    @Override
    public boolean delete(T persistent) {
        return this.dataStore.delete(persistent);
    }

    @Override
    public T load(K id) {
        return this.dataStore.load(this.getPersistentClass(), id);
    }

    @Override
    public T get(K id) {
        return this.dataStore.get(this.getPersistentClass(), id);
    }

    @Override
    public T single(Restriction restriction) {
        return this.dataStore.single(this.getPersistentClass(), restriction);
    }

    @Override
    public DataBag<T> list(Restriction restriction) {
        return this.dataStore.list(this.getPersistentClass(), restriction);
    }

    abstract Class<T> getPersistentClass();

    public void setDataStore(DataStore dataStore) {
        this.dataStore = dataStore;
    }
}
