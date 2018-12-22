package net.awaken.core;

import java.io.Serializable;
import java.util.Set;

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

    void setSuperior(E superior);

    void setMultiSuperiors(Set<E> multiSuperiors);
}
