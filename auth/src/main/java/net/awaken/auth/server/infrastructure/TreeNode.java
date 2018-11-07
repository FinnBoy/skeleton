package net.awaken.auth.server.infrastructure;

import java.io.Serializable;
import java.util.Set;

/**
 * 树形节点
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface TreeNode<ID extends Serializable> {

    ID id();

    /**
     * get subordinate groups.
     *
     * @return subordinates
     */
    <T extends TreeNode> Set<T> subordinates();

    /**
     * get superior group.
     *
     * @return superior
     */
    <T extends TreeNode> T superior();

    /**
     * validate whether this group belongs to input~group.
     *
     * @param superior
     * @return true if it subordinate to this superior.
     */
    <T extends TreeNode> boolean isSubordinateTo(T superior);

    /**
     * validate whether this group contains input~group.
     *
     * @param subordinate
     * @return true if has this subordinate.
     */
    <T extends TreeNode> boolean containsSubordinate(T subordinate);

    /**
     * search specified node by id.
     *
     * @param id  node id
     * @param <T> class of node
     * @return specified node
     */
    <T extends TreeNode> T searchSubordinate(ID id);
}
