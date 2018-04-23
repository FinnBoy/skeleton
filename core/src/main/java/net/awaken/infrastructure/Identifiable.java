package net.awaken.infrastructure;

import java.io.Serializable;

/**
 * identifier means unique.
 */
public interface Identifiable {

    <ID extends Serializable> ID getIdentifier();
}
