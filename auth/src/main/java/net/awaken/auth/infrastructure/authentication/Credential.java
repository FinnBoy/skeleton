package net.awaken.auth.infrastructure.authentication;

import net.awaken.auth.infrastructure.Account;

/**
 * 凭证
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Credential {

    Account getAccount();

}
