package net.awaken.core.defaults;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class FailedResult extends HandlerResultBase {

    public FailedResult() {
        this.gotoStatus(S_FAILURE);
    }

    public FailedResult(int errno) {
        this();
        this.errno = errno;
    }

    private int errno = -1;

    private StringBuilder message;

    public int getErrno() {
        return errno;
    }

    public FailedResult addMessage(String msg) {
        if (this.message == null) {
            this.message = new StringBuilder();
        }
        this.message.append(msg);
        return this;
    }

    @Override
    public boolean wrapped() {
        return false;
    }
}
