package net.awaken.server.domain.entity.permission;

import net.awaken.server.domain.entity.resource.Resource;

/**
 * 权限
 */
public interface Permission {

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
     * get resource.
     *
     * @return resource
     */
    Resource getResource();
}
