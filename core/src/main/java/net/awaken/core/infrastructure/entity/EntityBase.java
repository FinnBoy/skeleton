package net.awaken.core.infrastructure.entity;

import net.awaken.core.infrastructure.network.db.Entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018(jdk1.7)
 */
public abstract class EntityBase<ID extends Serializable> implements Entity<ID>, IUniqueKeySupport {

    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof EntityBase))
            return false;
        EntityBase<?> entity = (EntityBase<?>) o;
        return Objects.equals(getUniqueKey(), entity.getUniqueKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUniqueKey());
    }

    @Override
    public Serializable getUniqueKey() {
        return this.id;
    }
}
