package net.awaken.core.defaults;

import net.awaken.core.HandlerResult;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public abstract class HandlerResultBase implements HandlerResult {

    private int status;

    @Override
    public int status() {
        return status;
    }

    protected void gotoStatus(int status) {
        this.status = status;
    }

    protected void succeed() {
        this.gotoStatus(S_SUCCESS);
    }

    protected boolean handled() {
        return S_SUCCESS == this.status || S_FAILURE == this.status;
    }
}
