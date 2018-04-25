package net.awaken.access.database;

import net.awaken.access.database.bean.Persistent;

/**
 * @author Finn Zhao
 */
public interface DataConfiguration {

    /**
     * get index of {@link DataContainer} array.
     * <p>
     * important note:
     * after launching system and initializing DataSource Configs,
     * the order of DataService array will not be changed.
     * </p>
     * <p>
     * thread safety
     * </p>
     *
     * @param table
     * @return
     */
    int indexOfContainer(int table);

    /**
     * get the numeric code of this table
     * <p>
     * important note:
     * every {@link Persistent} Class can set a constant with the numeric code of this table
     * </p>
     * <p>
     * thread safety
     * </p>
     *
     * @return
     */
    int numeric(String table);
}
