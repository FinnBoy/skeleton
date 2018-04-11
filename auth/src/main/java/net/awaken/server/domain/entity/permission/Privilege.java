package net.awaken.server.domain.entity.permission;

import net.awaken.server.domain.entity.resource.Module;

import java.util.Set;

/**
 * this role's all permissions by module level.
 */
public interface Privilege {

    /**
     * get role.
     *
     * @return role
     */
    Role getRole();

    /**
     * get module.
     *
     * @return module
     */
    Module getModule();

    /**
     * get permissions.
     *
     * @return permissions
     */
    Set<Permission> getAllPermissions();
}
