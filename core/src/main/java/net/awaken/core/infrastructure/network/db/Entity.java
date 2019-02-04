package net.awaken.core.infrastructure.network.db;

import java.io.Serializable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 2019.02.01
 */
public interface Entity<ID extends Serializable> extends Record {

    ID getId();

    void setId(ID id);

}
