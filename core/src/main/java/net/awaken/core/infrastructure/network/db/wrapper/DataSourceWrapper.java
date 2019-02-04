package net.awaken.core.infrastructure.network.db.wrapper;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 2019.02.01
 */
public class DataSourceWrapper implements DataSource {

    private DataSource actual;

    @Override
    public Connection getConnection() throws SQLException {
        return actual.getConnection();
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return actual.getConnection(username, password);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return actual.unwrap(iface);
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return actual.isWrapperFor(iface);
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return actual.getLogWriter();
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        actual.setLogWriter(out);
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        actual.setLoginTimeout(seconds);
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return actual.getLoginTimeout();
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return actual.getParentLogger();
    }

    public void setActual(DataSource actual) {
        this.actual = actual;
    }

}
