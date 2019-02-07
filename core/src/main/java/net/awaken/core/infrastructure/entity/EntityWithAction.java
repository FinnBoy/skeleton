package net.awaken.core.infrastructure.entity;

import java.io.Serializable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public abstract class EntityWithAction<ID extends Serializable> extends EntityWithVersion<ID> {

    private ActionInfo actionInfo;

    public ActionInfo getActionInfo() {
        return actionInfo;
    }

    public void setActionInfo(ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
    }
}
