package net.awaken.core.entity;

import java.io.Serializable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public abstract class VersionEntity<ID extends Serializable> extends Entity<ID> {

    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
