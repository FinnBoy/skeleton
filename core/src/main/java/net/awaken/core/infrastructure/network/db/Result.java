package net.awaken.core.infrastructure.network.db;

import net.awaken.core.infrastructure.network.Response;

import java.util.List;

/**
 * Customized Result.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 2019.02.01
 */
public interface Result extends Response {

    /**
     * get pagination
     *
     * @return pagination
     */
    RowBounds getPagination();

    /**
     * get records from db.
     *
     * @return records
     */
    List<Record> getItems();

}
