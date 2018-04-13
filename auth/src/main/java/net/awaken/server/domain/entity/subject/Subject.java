package net.awaken.server.domain.entity.subject;

import net.awaken.domain.Entity;
import net.awaken.server.domain.entity.permission.Role;
import net.awaken.server.domain.entity.resource.Resource;

import java.util.Set;

/**
 * 主体
 */
public interface Subject extends Entity<Long> {

    /**
     * get Level.
     *
     * @return Level
     */
    Level getLevel();

    /**
     * get Organization.
     *
     * @return Organization
     */
    Organization getOrganization();

    /**
     * get Role.
     *
     * @return Role
     */
    Set<Role> getRoles();

    /**
     * validate if has the permission of this resource.
     * TODO: is it necessary to put this method here?
     *
     * @param resource
     * @return true if have permission of this resource, or not.
     */
    boolean isPermitted(Resource resource);

}
