package net.awaken.server.domain.entity.subject;

import net.awaken.server.domain.entity.AuthEntity;

/**
 * 组织
 */
public interface Organization extends AuthEntity<Long> {

    /**
     * get pattern.
     *
     * @return pattern
     * @see net.awaken.server.domain.constant.OrganizationPattern
     */
    Integer getPattern();

}
