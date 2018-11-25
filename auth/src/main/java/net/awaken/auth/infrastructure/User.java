package net.awaken.auth.infrastructure;

import java.util.Date;

/**
 * （主体）账户
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface User {

    /**
     * get subject.
     *
     * @return subject
     */
    Subject getSubject();

    /**
     * get profile.
     *
     * @return profile
     */
    SubjectProfile profile();

    /**
     * whether locked or not.
     *
     * @return locked
     */
    Boolean isLocked();

    /**
     * get the locked reason when the account is locked.
     *
     * @return locked reason
     */
    String getLockedReason();

    /**
     * get 失效期
     *
     * @return expiry date
     */
    Date getExpiryDatetime();

    /**
     * get the config~time of the interval of session timeout.
     *
     * @return config~time
     */
    Integer getSessionTimeout();

    /**
     * get max value of sessions.
     *
     * @return max value of sessions
     */
    Integer getMaxSessionCount();

    /**
     * get sessions' count at present.
     *
     * @return session count
     */
    Integer getSessionCount();

    /**
     * terminate this session
     *
     * @param session
     */
    void terminate(String session);

}
