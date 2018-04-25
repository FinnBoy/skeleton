package net.awaken.access.database.bean;

/**
 * Query Condition.
 *
 * @author Finn Zhao
 */
public interface Restriction {

    /**
     * get pagination
     *
     * @return pagination
     */
    RowBounds getPagination();
}
