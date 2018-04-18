package net.awaken.infrastructure.db;

import java.io.Serializable;

/**
 * @param <ID> Table Primary Key
 * @author Finn Zhao
 */
public abstract class PersistentBase<ID extends Serializable> implements Persistent<ID> {

    private ID id;

    @Override
    public ID getId() {
        return id;
    }

    @Override
    public void setId(ID id) {
        this.id = id;
    }
}
