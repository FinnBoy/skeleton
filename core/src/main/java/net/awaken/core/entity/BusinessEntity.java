package net.awaken.core.entity;

import java.io.Serializable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public abstract class BusinessEntity<ID extends Serializable, BusinessId extends Serializable> extends Entity<ID> {

    private BusinessId businessId;

    public BusinessId getBusinessId() {
        return businessId;
    }

    public void setBusinessId(BusinessId businessId) {
        this.businessId = businessId;
    }
}
