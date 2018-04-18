package net.awaken.infrastructure.db;

/**
 * @author Finn Zhao
 */
public interface DataConfig {

    /**
     * get index of DataService array.
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
    int indexOfDataService(int table);

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
