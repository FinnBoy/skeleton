package net.awaken.core.infrastructure.bean;

import java.io.Serializable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public interface CascadeExtend<E, ID extends Serializable> extends Cascade<E, ID> {

    /**
     * add specified node.
     *
     * @param node node
     */
    void addSubordinate(E node);

}
