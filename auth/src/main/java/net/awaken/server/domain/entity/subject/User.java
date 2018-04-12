package net.awaken.server.domain.entity.subject;

import java.util.Date;
import java.util.Set;

/**
 *
 */
public interface User {

    /**
     * get principal.
     *
     * @return principal
     */
    Principal getPrincipal();

    /**
     * get credentials.
     *
     * @return credentials
     */
    Set<Credential> getCredentials();

    /**
     * whether locked or not.
     *
     * @return locked
     */
    Boolean isLocked();

    /**
     * whether disabled or not.
     *
     * @return disabled
     */
    Boolean isDisabled();

    /**
     * get 失效期
     *
     * @return expiry date
     */
    Date getExpiryDate();

    /**
     * get interval of session timeout.
     *
     * @return interval
     */
    Integer getSessionTimeout();

    /**
     * 验证 TODO: not be put this method here.
     *
     * @param credential
     * @return
     */
    boolean authorize(Credential credential);
}
