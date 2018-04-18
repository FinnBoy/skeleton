package net.awaken.infrastructure.db;

/**
 * a interface for hiding {@link javax.sql.DataSource}
 *
 * @author Finn Zhao
 */
public interface DataService {

    int getRuntimeSerialUID();

    DataSession openSession();
}
