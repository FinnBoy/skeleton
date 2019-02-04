package net.awaken.core.infrastructure.exception;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 2019.02.01
 */
public class AlarmMessage {

    public AlarmMessage() {
    }

    public AlarmMessage(int errno) {
        this.errno = errno;
    }

    public AlarmMessage(int errno, Object[] args) {
        this.errno = errno;
        this.args = args;
    }

    public AlarmMessage(String description) {
        this.description = description;
    }

    private int errno;

    /**
     * <b>error</b> or <b>warning</b> or <b>note</b>.
     */
    private int kind;

    private Object[] args;

    private String description;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
