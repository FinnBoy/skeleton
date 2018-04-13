package net.awaken.server.domain.entity.resource;

import net.awaken.domain.Entity;

/**
 * 资源
 */
public interface Resource extends Entity<Long> {

    /**
     * get code.
     *
     * @return code
     */
    String getCode();
}
