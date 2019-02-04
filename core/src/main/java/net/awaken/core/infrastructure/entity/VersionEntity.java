package net.awaken.core.infrastructure.entity;

import java.io.Serializable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public abstract class VersionEntity<ID extends Serializable> extends BaseEntity<ID> {

    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
