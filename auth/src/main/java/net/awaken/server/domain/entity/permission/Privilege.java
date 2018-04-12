package net.awaken.server.domain.entity.permission;

import net.awaken.server.domain.entity.resource.Module;

import java.util.Set;

/**
 * permissions by module level.
 * <p>
 * <b>Value Object</b>
 */
public interface Privilege {

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
    Set<Permission> getPermissions();
}
