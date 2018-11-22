package net.awaken.auth.infrastructure;

import net.awaken.auth.Entry;

import java.util.Date;

/**
 * once login, once session.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface UserSession extends Entry<String> {

    /**
     * get actual user which the subject login by.
     *
     * @return user
     */
    User getUser();

    /**
     * get running user.
     *
     * @return running user
     */
    User getRunningUser();

    /**
     * run as specified user if has the special privilege.
     *
     * @param user user
     */
    void runAs(User user);

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
     * get activate role.
     * TODO:
     *
     * @return activate role
     */
    Role getActivateRole();

    /**
     * get 最近操作时间
     * TODO: 另建 User Operation Log，由此表维护？
     *
     * @return last operation datetime
     */
    Date getLastOperationDatetime();

}
