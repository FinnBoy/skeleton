package net.awaken.core.infrastructure.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public abstract class BusinessEntity<ID extends Serializable, BusinessId extends Serializable> extends BaseEntity<ID> {

    private BusinessId businessId;

    public BusinessId getBusinessId() {
        return businessId;
    }

    public void setBusinessId(BusinessId businessId) {
        this.businessId = businessId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof BusinessEntity))
            return false;
        BusinessEntity<?, ?> entity = (BusinessEntity<?, ?>) o;
        return Objects.equals(businessId, entity.businessId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessId);
    }
}
