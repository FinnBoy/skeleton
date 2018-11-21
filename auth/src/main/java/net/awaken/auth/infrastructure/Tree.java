package net.awaken.auth.infrastructure;

import java.io.Serializable;

/**
 * 树形容器
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Tree<ID extends Serializable, E extends Node<ID, E>> {

    /**
     * search specified node by id.
     *
     * @param id node id
     * @return specified node
     */
    E get(ID id);

    /**
     * check whether exists.
     *
     * @param id node id
     * @return true if exists.
     */
    boolean contains(ID id);

    /**
     * check whether exists.
     *
     * @param node node
     * @return true if exists.
     */
    boolean contains(E node);

    /**
     * remove this node and cascading subordinates.
     *
     * @param id node id
     */
    void removeCascading(ID id);

    /**
     * @param node node
     * @see this#removeCascading(Serializable)
     */
    void removeCascading(E node);
}
