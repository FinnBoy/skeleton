package net.awaken.domain;

import java.io.Serializable;

/**
 * Entity
 */
public interface Entity<S extends Serializable> {

    S getId();

    void setId(S id);
}
