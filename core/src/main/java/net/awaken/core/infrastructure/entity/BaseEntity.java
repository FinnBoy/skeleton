package net.awaken.core.infrastructure.entity;

import net.awaken.core.infrastructure.network.db.Entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018(jdk1.7)
 */
public abstract class BaseEntity<ID extends Serializable> implements Entity<ID> {

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
        if (!(o instanceof BaseEntity))
            return false;
        BaseEntity<?> entity = (BaseEntity<?>) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
