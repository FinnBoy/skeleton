package net.awaken.server.domain.entity.subject;

import net.awaken.server.domain.constant.PermissionAction;
import net.awaken.server.domain.entity.resource.Gadget;

public interface Session {

    /**
     * get user.
     *
     * @return user
     */
    User getUser();

    /**
     * get principal.
     *
     * @return principal
     */
    Principal runAs();

    /**
     * verify permission.
     *
     * @param action
     * @param gadget
     * @return
     */
    boolean verify(PermissionAction action, Gadget gadget);
}
