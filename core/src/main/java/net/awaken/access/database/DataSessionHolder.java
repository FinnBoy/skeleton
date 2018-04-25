package net.awaken.access.database;

/**
 * keep session info in {@link ThreadLocal}
 *
 * @author Finn Zhao
 */
public interface DataSessionHolder {

    /**
     * get data session by dataService in current thread.
     *
     * @param container
     * @return data session
     */
    DataSession get(DataContainer container);

    /**
     * push in.
     *
     * @param container DB server mapping
     * @param session   logic API of DB Connection
     */
    void put(DataContainer container, DataSession session);
}
