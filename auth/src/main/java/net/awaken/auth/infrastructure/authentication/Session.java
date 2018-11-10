package net.awaken.auth.infrastructure.authentication;

import net.awaken.auth.Entry;
import net.awaken.auth.infrastructure.Account;
import net.awaken.auth.infrastructure.authorization.Role;

import java.util.Date;

/**
 * once login, once session.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Session extends Entry<String> {

    /**
     * get principal.
     * TODO:
     *
     * @return principal
     */
    Principal runAs();

    /**
     * get activate role.
     * TODO:
     *
     * @return activate role
     */
    Role getActivateRole();

    /**
     * get user.
     *
     * @return user
     */
    Account getAccount();

    /**
     * terminate this session
     */
    void terminate();

    /**
     * whether terminated or not.
     *
     * @return true if terminated
     */
    Boolean isTerminated();

    /**
     * get 最近操作时间
     * TODO: 另建 Account Operation Log，由此表维护？
     *
     * @return last operation datetime
     */
    Date getLastOperationDatetime();

}
