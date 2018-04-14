package net.awaken.server.domain.entity.resource;

import net.awaken.server.domain.entity.AuthEntity;

/**
 * 资源
 */
public interface Resource extends AuthEntity<Long> {

    /**
     * get code.
     *
     * @return code
     */
    String getCode();
}
