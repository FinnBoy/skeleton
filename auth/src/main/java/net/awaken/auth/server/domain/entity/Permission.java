package net.awaken.auth.server.domain.entity;

import net.awaken.auth.server.domain.constant.PermissionAction;

/**
 * 权限
 * <p>只设置正向授权，反向禁权可以通过client逻辑来提高用户体验。</p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Permission {

    /**
     * enum: read, insert, update, delete, execute
     *
     * @return
     * @see PermissionAction
     */
    Integer getAction();

    /**
     * get resource.
     *
     * @return resource
     */
    Resource getResource();
}
