package net.awaken.auth.infrastructure;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface AuthenticationToken {

    /**
     * Returns the account identity submitted during the authentication process.
     *
     * @return the account identity submitted during the authentication process.
     */
    Object getPrincipal();

    /**
     * Returns the credentials submitted by the user during the authentication process that verifies
     * the submitted {@link #getPrincipal() account identity}.
     *
     * @return the credential submitted by the user during the authentication process.
     */
    Object getCredentials();

}
