package net.awaken.core.infrastructure.exception;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 2019.02.01
 */
public class SkeletonException extends RuntimeException {

    private List<AlarmMessage> messages = new LinkedList<AlarmMessage>();

    public SkeletonException(int errno) {
        super();
        messages.add(new AlarmMessage(errno));
    }

    public SkeletonException(int errno, Object[] args) {
        super();
        messages.add(new AlarmMessage(errno, args));
    }

    public SkeletonException(String message) {
        super(message);
        messages.add(new AlarmMessage(message));
    }

    public SkeletonException(List<AlarmMessage> messages) {
        super(String.valueOf(messages));
        messages.addAll(messages);
    }

    public SkeletonException(int errno, Throwable cause) {
        super(cause);
        messages.add(new AlarmMessage(errno));
    }

    public SkeletonException(int errno, Object[] args, Throwable cause) {
        super(cause);
        messages.add(new AlarmMessage(errno, args));
    }

    public SkeletonException(String message, Throwable cause) {
        super(message, cause);
        messages.add(new AlarmMessage(message));
    }

    public SkeletonException(List<AlarmMessage> messages, Throwable cause) {
        super(cause);
        messages.addAll(messages);
    }

    public List<AlarmMessage> getMessages() {
        return messages;
    }

}
