package net.awaken.server.domain.entity.subject;

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
     * 验证 TODO: not be put this method here.
     *
     * @param credential
     * @return
     */
    boolean authorize(Credential credential);
}
