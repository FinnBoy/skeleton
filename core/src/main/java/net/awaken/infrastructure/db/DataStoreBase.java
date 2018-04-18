package net.awaken.infrastructure.db;

import java.io.Serializable;

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
        DataSessionHolder sessionHolder = DataContext.getSessionHolder();
        DataSession session;
        if (sessionHolder == null || sessionHolder.get(dataService) == null) {
            session = dataService.openSession();
            // TODO: add session to holder
        } else {
            session = sessionHolder.get(dataService);
        }
        return session;
    }

    public <ID extends Serializable, T extends Persistent<ID>> ID save(T persistent) throws DataException {
        DataSession session;
        // TODO
        session = this.getSession(persistent);
        session = this.getSession(persistent.getClass());
        return null;
    }

    public void setDataServices(DataService[] dataServices) {
        this.dataServices = dataServices;
    }

    public void setDataConfig(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }
}
