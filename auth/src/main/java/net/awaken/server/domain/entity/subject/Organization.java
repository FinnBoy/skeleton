package net.awaken.server.domain.entity.subject;

import net.awaken.domain.Entity;

/**
 * 组织
 */
public interface Organization extends Entity<Long> {

    /**
     * get pattern.
     *
     * @return pattern
     * @see net.awaken.server.domain.constant.OrganizationPattern
     */
    Integer getPattern();

}
