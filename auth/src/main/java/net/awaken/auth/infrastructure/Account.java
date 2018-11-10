package net.awaken.auth.infrastructure;

import java.util.Date;

/**
 * （主体）账户
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Account {

    /**
     * get subject.
     *
     * @return subject
     */
    Subject getSubject();

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
    Date getExpiryDate();

}
