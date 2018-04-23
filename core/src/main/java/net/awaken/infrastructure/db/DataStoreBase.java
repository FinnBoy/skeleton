package net.awaken.infrastructure.db;

import java.io.Serializable;
import java.util.List;

/**
 * @author Finn Zhao
 */
public abstract class DataStoreBase implements DataStore {

    private DataService[] dataServices;

    private DataConfig dataConfig;

    private <T extends Data> DataService getDataService(T data) {
        int index = dataConfig.indexOfDataService(data.table());
        return dataServices[index];
    }

    private <T extends Data> DataService getDataService(Class<T> table) {
        int numeric = dataConfig.numeric(table.getSimpleName());
        int index = dataConfig.indexOfDataService(numeric);
        return dataServices[index];
    }

    private <T extends Data> DataSession getSession(T data) {
        DataService dataService = this.getDataService(data);
        return this.getSession(dataService);
    }

    private <T extends Data> DataSession getSession(Class<T> table) {
        DataService dataService = this.getDataService(table);
        return this.getSession(dataService);
    }

    private DataSession getSession(DataService dataService) {

        DataSessionHolder sessionHolder = DataContext.getSessionHolder(this);

        if (sessionHolder == null) {
            if (!DataContext.isActive()) {
                DataContext.create();
            }
            sessionHolder = null; // TODO: create SessionHolder
            DataContext.put(this, sessionHolder);
        }

        DataSession session;

        session = sessionHolder.get(dataService);
        if (session == null) {
            session = dataService.openSession();
            sessionHolder.put(dataService, session);
        }

        return session;
    }

    public <ID extends Serializable, T extends Persistent<ID>> ID save(T persistent) throws DataException {
        return this.getSession(persistent).save(persistent);
    }

    public void alter(Data persistent) throws DataException {
        this.getSession(persistent).alter(persistent);
    }

    public void drop(Data persistent) throws DataException {
        this.getSession(persistent).drop(persistent);
    }

    public boolean insert(Data persistent) throws DataException {
        return this.getSession(persistent).insert(persistent);
    }

    public boolean update(Data persistent) throws DataException {
        return this.getSession(persistent).update(persistent);
    }

    public boolean delete(Data persistent) throws DataException {
        return this.getSession(persistent).delete(persistent);
    }

    public <T extends Data> T load(Class<T> clazz, Serializable id) throws DataException {
        return this.getSession(clazz).load(clazz, id);
    }

    public <T extends Data> T get(Class<T> clazz, Serializable id) throws DataException {
        return this.getSession(clazz).get(clazz, id);
    }

    public <T extends Data> T single(Class<T> clazz, Restriction restriction) throws DataException {
        return this.getSession(clazz).single(clazz, restriction);
    }

    public <E extends Data> List<E> list(Class<E> clazz, Restriction restriction) throws DataException {
        return this.getSession(clazz).list(clazz, restriction);
    }

    public <E extends Data> List<E> list(Class<E> clazz, Restriction restriction, RowBounds rowBounds) throws
            DataException {
        return this.getSession(clazz).list(clazz, restriction, rowBounds);
    }

    public void setDataServices(DataService[] dataServices) {
        this.dataServices = dataServices;
    }

    public void setDataConfig(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }
}
