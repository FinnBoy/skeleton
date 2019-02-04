package net.awaken.core.infrastructure.network.db;

import net.awaken.core.infrastructure.exception.AlarmMessage;
import net.awaken.core.infrastructure.exception.SkeletonException;

import java.util.List;

/**
 * DB Data Access Exception.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 2019.02.01
 */
public class DatabaseException extends SkeletonException {

    public DatabaseException(int errno) {
        super(errno);
    }

    public DatabaseException(int errno, Object[] args) {
        super(errno, args);
    }

    public DatabaseException(String message) {
        super(message);
    }

    public DatabaseException(List<AlarmMessage> messages) {
        super(messages);
    }

    public DatabaseException(int errno, Throwable cause) {
        super(errno, cause);
    }

    public DatabaseException(int errno, Object[] args, Throwable cause) {
        super(errno, args, cause);
    }

    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public DatabaseException(List<AlarmMessage> messages, Throwable cause) {
        super(messages, cause);
    }

}
