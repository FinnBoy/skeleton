package net.awaken.core;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public interface Cascade<E, ID extends Serializable> {

    /**
     * check whether this node is the root(which does not have superior).
     *
     * @return true if it's the root.
     */
    boolean isRoot();

    /**
     * get subordinate groups.
     *
     * @return subordinates
     */
    Set<E> subordinates();

    /**
     * get superior group.
     *
     * @return superior
     */
    E superior();

    /**
     * check if has multi superiors.
     *
     * @return true if has.
     */
    boolean hasMultiSuperiors();

    /**
     * get multi superiors.
     *
     * @return multi superiors
     */
    Set<E> multiSuperiors();

    /**
     * validate whether this group contains input~subordinate.
     *
     * @param subordinate
     * @return true if has this subordinate.
     */
    boolean containsSubordinate(E subordinate);

    /**
     * get subordinate input~id.
     *
     * @param subordinateId subordinate Id
     * @return subordinate by id.
     */
    E searchSubordinate(ID subordinateId);

}
