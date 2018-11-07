package net.awaken.auth.server.domain.entity;

import net.awaken.auth.server.infrastructure.TreeNode;

import java.util.Set;

/**
 * 组织，团体
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Group extends TreeNode<Long> {

    /**
     * get owners.
     *
     * @return owners
     */
    Set<Principal> owners();

    /**
     * get members(exclude owners).
     *
     * @return members
     */
    Set<Principal> members();

    /**
     * get principals(include owners).
     *
     * @return principals
     */
    Set<Principal> principals();

}
