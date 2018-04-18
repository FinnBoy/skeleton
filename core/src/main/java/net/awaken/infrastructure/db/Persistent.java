package net.awaken.infrastructure.db;

import java.io.Serializable;

/**
 * Persistent Object.
 *
 * @author Finn Zhao
 */
public interface Persistent<ID extends Serializable> extends Data {

    ID getId();

    void setId(ID id);
}
