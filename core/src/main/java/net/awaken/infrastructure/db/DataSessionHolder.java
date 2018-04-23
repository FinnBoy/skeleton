package net.awaken.infrastructure.db;

/**
 * keep session info in {@link ThreadLocal}
 *
 * @author Finn Zhao
 */
public interface DataSessionHolder {

    /**
     * get data session by dataService in current thread.
     *
     * @param dataService
     * @return data session
     */
    DataSession get(DataService dataService);

    /**
     * push in.
     *
     * @param dataService DB server mapping
     * @param dataSession logic API of DB Connection
     */
    void put(DataService dataService, DataSession dataSession);
}
