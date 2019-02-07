package net.awaken.core.infrastructure.entity;

import java.io.Serializable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public abstract class EntityWithBusiness<ID extends Serializable, BusinessId extends Serializable> extends EntityWithAction<ID> implements IBusinessKeySupport<BusinessId> {

    @Override
    public Serializable getUniqueKey() {
        return this.getBusinessKey();
    }
}
