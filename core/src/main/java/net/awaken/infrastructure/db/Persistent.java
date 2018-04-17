package net.awaken.infrastructure.db;

import java.io.Serializable;

/**
 * 持久化对象
 */
public interface Persistent<ID extends Serializable> extends Serializable {

    ID getId();

    void setId(ID id);
}
