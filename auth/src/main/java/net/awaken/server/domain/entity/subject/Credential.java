package net.awaken.server.domain.entity.subject;

import net.awaken.domain.Entity;

/**
 * 凭证
 */
public interface Credential extends Entity<Long> {

    User getUser();

}
