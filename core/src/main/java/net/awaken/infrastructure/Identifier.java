package net.awaken.infrastructure;

import java.io.Serializable;

/**
 * identifier means unique.
 *
 * @param <ID>
 */
public interface Identifier<ID extends Serializable> {

    ID getId();

    void setId(ID id);
}
