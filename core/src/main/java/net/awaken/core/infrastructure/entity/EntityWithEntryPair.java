package net.awaken.core.infrastructure.entity;

import java.io.Serializable;

/**
 * default key-value pair entity.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public abstract class EntityWithEntryPair<BizKey extends Serializable, Info extends Serializable> extends EntityWithBusiness<Long, BizKey> {

    private BizKey key;

    private Info description;

    public BizKey getKey() {
        return key;
    }

    public void setKey(BizKey key) {
        this.key = key;
    }

    public Info getDescription() {
        return description;
    }

    public void setDescription(Info description) {
        this.description = description;
    }

    @Override
    public BizKey getBusinessKey() {
        return this.key;
    }
}
