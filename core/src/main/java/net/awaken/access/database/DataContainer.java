package net.awaken.access.database;

/**
 * a interface for hiding {@link javax.sql.DataSource}
 *
 * @author Finn Zhao
 */
public interface DataContainer extends LifeCycle {

    /**
     * only one of Containers can do read-write operation in a application,
     * others must open session in read mode.
     *
     * @return true if in read-mode
     */
    boolean isReadOnly();

    /**
     * open new Session
     *
     * @return session
     */
    DataSession openSession();
}
