package net.awaken.server.domain.entity.permission;

import net.awaken.server.domain.entity.resource.Aggregation;

import java.util.Set;

/**
 * permissions by aggregation level.
 * <p>
 * <b>Value Object</b>
 */
public interface Power {

    /**
     * get aggregation.
     *
     * @return aggregation
     */
    Aggregation getAggregation();

    /**
     * get privileges.
     *
     * @return privileges
     */
    Set<Privilege> getPrivileges();
}
