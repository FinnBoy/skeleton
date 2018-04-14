package net.awaken.server.domain.entity.subject;

import net.awaken.server.domain.entity.AuthEntity;

/**
 * 凭证
 */
public interface Credential extends AuthEntity<Long> {

    User getUser();

}
