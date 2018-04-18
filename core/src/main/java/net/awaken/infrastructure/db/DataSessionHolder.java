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
}
