package net.awaken.core.pojo;

import net.awaken.core.entity.Entity;

import java.io.Serializable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public abstract class VersionIdCriteria<ID extends Serializable> extends Entity<ID> {

    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
