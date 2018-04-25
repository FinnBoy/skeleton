package net.awaken.access.database;

import net.awaken.access.database.bean.*;

import java.io.Serializable;

/**
 * @author Finn Zhao
 */
public abstract class DataStoreBase implements DataStore {

    private DataContainer[] containers;

    private DataConfiguration configuration;

    private <T extends Record> DataContainer getContainer(T data) {
        int index = configuration.indexOfContainer(data.table());
        return containers[index];
    }

    private <T extends Record> DataContainer getContainer(Class<T> table) {
        int numeric = configuration.numeric(table.getSimpleName());
        int index = configuration.indexOfContainer(numeric);
        return containers[index];
    }

    private <T extends Record> DataSession getSession(T data) {
        DataContainer container = this.getContainer(data);
        return this.getSession(container);
    }

    private <T extends Record> DataSession getSession(Class<T> table) {
        DataContainer container = this.getContainer(table);
        return this.getSession(container);
    }

    private DataSession getSession(DataContainer container) {

        DataSessionHolder sessionHolder = DataContext.getSessionHolder(this);

        if (sessionHolder == null) {
            if (!DataContext.isActive()) {
                DataContext.create();
            }
            sessionHolder = DataFactory.createSessionHolder();
            DataContext.put(this, sessionHolder);
        }

        DataSession session;

        session = sessionHolder.get(container);
        if (session == null) {
            session = container.openSession();
            sessionHolder.put(container, session);
        }

        return session;
    }

    public <ID extends Serializable, T extends Persistent<ID>> ID save(T persistent) {
        return this.getSession(persistent).save(persistent);
    }

    public void alter(Record persistent) {
        this.getSession(persistent).alter(persistent);
    }

    public void drop(Record persistent) {
        this.getSession(persistent).drop(persistent);
    }

    public boolean insert(Record persistent) {
        return this.getSession(persistent).insert(persistent);
    }

    public boolean update(Record persistent) {
        return this.getSession(persistent).update(persistent);
    }

    public boolean delete(Record persistent) {
        return this.getSession(persistent).delete(persistent);
    }

    public int execute(String namedStatement) {
        return 0; // TODO
    }

    public int execute(String namedStatement, Restriction restriction) {
        return 0; // TODO
    }

    public <T extends Record> T load(Class<T> clazz, Serializable id) {
        return this.getSession(clazz).load(clazz, id);
    }

    public <T extends Record> T get(Class<T> clazz, Serializable id) {
        return this.getSession(clazz).get(clazz, id);
    }

    public <T extends Record> T single(Class<T> clazz, Restriction restriction) {
        return this.getSession(clazz).single(clazz, restriction);
    }

    public <E extends Record> DataBag<E> list(Class<E> clazz, Restriction restriction) {
        return this.getSession(clazz).list(clazz, restriction);
    }

    public <E extends Result> DataBag<E> query(String namedStatement, Class<E> clazz, Restriction restriction) {
        return null; // TODO
    }

    public <T extends Result> T seek(String namedStatement, Class<T> clazz, Restriction restriction) {
        return null; // TODO
    }

    public <T extends Number> T numeric(String namedStatement, Class<T> clazz, Restriction restriction) {
        return null; // TODO
    }

    public String literal(String namedStatement, Restriction restriction) {
        return null; // TODO
    }

    public void setContainers(DataContainer[] containers) {
        this.containers = containers;
    }

    public void setConfiguration(DataConfiguration configuration) {
        this.configuration = configuration;
    }
}
