package net.awaken.auth.infrastructure;

import java.io.Serializable;
import java.util.Set;

/**
 * 树形节点
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface TreeNode<ID extends Serializable, E> extends Entry<ID> {

    /**
     * returns the level of current node.
     *
     * @return level
     */
    int level();

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
     * validate whether this group belongs to input~group.
     *
     * @param superior
     * @return true if it subordinate to this superior.
     */
    boolean isSubordinateTo(E superior);

    /**
     * validate whether this group contains input~group.
     *
     * @param subordinate
     * @return true if has this subordinate.
     */
    boolean containsSubordinate(E subordinate);

    /**
     * search specified node by id.
     *
     * @param id node id
     * @return specified node
     */
    E searchSubordinate(ID id);

    /**
     * remove all of subordinates.
     */
    void clearSubordinates();

    /**
     * remove specified node by id.
     *
     * @param node node
     * @return found node
     */
    void removeSubordinate(E node);

    /**
     * add specified node.
     *
     * @param node node
     */
    void addSubordinate(E node);

    /**
     * move this node includes cascading subordinates to the specified node.
     *
     * @param node node
     */
    void moveTo(E node);

    /**
     * move these subordinates(except this node) to the specified node.
     *
     * @param node node
     */
    void moveSubordinatesTo(E node);
}
