package net.awaken.access.database.bean;

import java.io.Serializable;

/**
 * Persistent Object.
 *
 * @author Finn Zhao
 */
public interface Persistent<ID extends Serializable> extends Record {

    ID getId();

    void setId(ID id);
}
