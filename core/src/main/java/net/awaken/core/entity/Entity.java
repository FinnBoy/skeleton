package net.awaken.core.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public abstract class Entity<ID extends Serializable> {

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
        if (!(o instanceof Entity))
            return false;
        Entity<?> entity = (Entity<?>) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
