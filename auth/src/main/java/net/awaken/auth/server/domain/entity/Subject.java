package net.awaken.auth.server.domain.entity;

import java.util.Set;

/**
 * 主体
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Subject extends AuthEntity<Long> {

    /**
     * get Level.
     *
     * @return Level
     */
    Level level();

    /**
     * get Role.
     *
     * @return Role
     */
    Set<Role> roles();

    /**
     * validate if has the permission of this resource.
     * TODO: is it necessary to put this method here?
     *
     * @param resource
     * @return true if have permission of this resource, or not.
     */
    boolean isPermitted(Resource resource);

}
