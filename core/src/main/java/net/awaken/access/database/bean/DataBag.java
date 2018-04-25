package net.awaken.access.database.bean;

import java.util.List;

/**
 * @param <E>
 * @author Finn Zhao
 */
public interface DataBag<E extends Data> {

    /**
     * get pagination
     *
     * @return pagination
     */
    RowBounds getPagination();

    /**
     * get results.
     *
     * @return query data list
     */
    List<E> getDataBeans();
}
