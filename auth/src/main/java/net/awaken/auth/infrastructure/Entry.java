package net.awaken.auth.infrastructure;

import java.io.Serializable;

/**
 * 条目
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Entry<ID extends Serializable> {

    ID identifier();

}
