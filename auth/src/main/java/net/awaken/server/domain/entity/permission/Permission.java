package net.awaken.server.domain.entity.permission;

import net.awaken.domain.Entity;
import net.awaken.server.domain.entity.resource.Gadget;

/**
 * 权限
 */
public interface Permission extends Entity<Long> {

    /**
     * enum: read, insert, update, delete, execute
     *
     * @return
     * @see net.awaken.server.domain.constant.PermissionAction
     */
    Integer getAction();

    /**
     * enum: deny, authorize
     *
     * @return
     * @see net.awaken.server.domain.constant.PermissionDecision
     */
    Integer getDecision();

    /**
     * get gadget.
     *
     * @return gadget
     */
    Gadget getGadget();
}
