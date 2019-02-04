package net.awaken.core.infrastructure.network.db;

import net.awaken.core.infrastructure.network.Request;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 2019.02.01
 */
public interface Criteria extends Request {

    /**
     * get pagination
     *
     * @return pagination
     */
    RowBounds getPagination();

    /**
     * get result's record type.
     *
     * @return record type
     */
    Class<Record> getType();
}
