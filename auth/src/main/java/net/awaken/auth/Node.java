package net.awaken.auth;

import java.io.Serializable;
import java.util.Set;

/**
 * 树形节点
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Node<ID extends Serializable, T> extends Entry<ID> {

    /**
     * get subordinate groups.
     *
     * @return subordinates
     */
    Set<T> subordinates();

    /**
     * get superior group.
     *
     * @return superior
     */
    T superior();

    /**
     * validate whether this group belongs to input~group.
     *
     * @param superior
     * @return true if it subordinate to this superior.
     */
    boolean isSubordinateTo(T superior);

    /**
     * validate whether this group contains input~group.
     *
     * @param subordinate
     * @return true if has this subordinate.
     */
    boolean containsSubordinate(T subordinate);

    /**
     * search specified node by id.
     *
     * @param id node id
     * @return specified node
     */
    T searchSubordinate(ID id);

    /**
     * check if is a leaf resource.
     *
     * @return
     */
    boolean isLeaf();

    /**
     * check if is the root resource.
     *
     * @return
     */
    boolean isRoot();

}
