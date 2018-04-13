package net.awaken.server.domain.entity.subject;

import net.awaken.domain.Entity;
import net.awaken.server.domain.entity.permission.Role;
import net.awaken.server.domain.entity.resource.Module;

import java.util.Date;

/**
 * once login, once session.
 */
public interface Session extends Entity<Long> {

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
     * get activate role.
     *
     * @return activate role
     */
    Role getActivateRole();

    /**
     * get current module.
     *
     * @return current module
     */
    Module getCurrentModule();

    /**
     * get 最近操作时间
     * TODO: 另建 User Operation Log，由此表维护？
     *
     * @return last operation datetime
     */
    Date getLastOperationDatetime();

    /**
     * whether disabled or not.
     *
     * @return disabled
     */
    Boolean isDisabled();

}
