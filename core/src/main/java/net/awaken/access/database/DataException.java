package net.awaken.access.database;

/**
 * DB Data Access Exception.
 *
 * @author Finn Zhao
 */
public class DataException extends RuntimeException {

    private int errno;

    public DataException() {
        super();
    }

    public DataException(String message) {
        super(message);
    }

    public DataException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataException(Throwable cause) {
        super(cause);
    }

    public DataException(int errno) {
        super();
        this.errno = errno;
    }

    public DataException(int errno, String message) {
        super(message);
        this.errno = errno;
    }

    public DataException(int errno, String message, Throwable cause) {
        super(message, cause);
        this.errno = errno;
    }

    public DataException(int errno, Throwable cause) {
        super(cause);
        this.errno = errno;
    }

    public int getErrno() {
        return errno;
    }
}
