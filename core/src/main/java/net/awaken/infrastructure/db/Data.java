package net.awaken.infrastructure.db;

import java.io.Serializable;

/**
 * @author Finn Zhao
 */
public interface Data extends Serializable {
    int table();
}
