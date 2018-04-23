package net.awaken.infrastructure.db;

import net.awaken.infrastructure.Identifiable;

import java.io.Serializable;

/**
 * Persistent Object.
 *
 * @author Finn Zhao
 */
public interface Persistent<ID extends Serializable> extends Identifiable, Data {

    ID getId();

    void setId(ID id);
}
