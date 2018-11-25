package net.awaken.auth.infrastructure;

/**
 * 认证器
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Authenticator {

    /**
     * authenticate token.
     *
     * @param authenticationToken token contains principal and credential.
     * @return User Session
     * @see UserSession
     */
    UserSession authenticate(AuthenticationToken authenticationToken);

}
