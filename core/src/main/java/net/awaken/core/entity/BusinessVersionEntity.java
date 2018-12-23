package net.awaken.core.entity;

import java.io.Serializable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public abstract class BusinessVersionEntity<ID extends Serializable, BusinessId extends Serializable> extends BusinessEntity<ID, BusinessId> {

    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
