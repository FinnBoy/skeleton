package net.awaken.auth.infrastructure;

import java.util.Date;
import java.util.Set;

/**
 * once login, once session.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface UserSession extends Entry<String> {

    /**
     * get principal info.
     * <p>
     * {@link User} 作为一个账户的抽象。
     * 而 principal 是实际的账户信息（可以有多个），同时 credential 作为该实际账户 principal 的凭证用于 登录认证。
     * </p>
     *
     * @return principal info
     */
    Object getPrincipalInfo();

    /**
     * get actual user which the subject login by.
     *
     * @return user
     */
    User getUser();

    /**
     * get running subject.
     *
     * @return running subject
     */
    Subject getRunningSubject();

    /**
     * whether terminated or not.
     *
     * @return true if terminated
     */
    Boolean isTerminated();

    /**
     * get 最近操作时间
     * TODO: 另建 User Operation Log，由此表维护？
     *
     * @return last operation datetime
     */
    Date getLastOperationDatetime();

    /**
     * get session 失效期.
     *
     * @return expiry date
     */
    Date getExpiryDatetime();

    /**
     * get session 持续时间.
     *
     * @return duration of the session
     */
    Integer getDuration();

    /**
     * get active privileges.
     *
     * @return active privileges
     */
    Set<SubjectPrivilege> getActivePrivileges();

    /**
     * activate all of the subject's privileges.
     */
    void activateAll();

    /**
     * activate the specified owned privilege.
     *
     * @param role owned role
     */
    void activate(String role);

    /**
     * run as specified subject if has the special privilege.
     *
     * @param subject subject
     */
    void runAs(Subject subject);

    /**
     * @param subject subject
     * @param role    role
     * @see this#runAs(Subject)
     */
    void runAs(Subject subject, String role);

    /**
     * terminate this session
     */
    void terminate();

}
