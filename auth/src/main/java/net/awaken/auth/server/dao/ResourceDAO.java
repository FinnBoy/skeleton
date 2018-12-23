package net.awaken.auth.server.dao;

import net.awaken.auth.server.entity.resource.Resource;
import net.awaken.core.dao.BusinessIdDAO;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public interface ResourceDAO extends BusinessIdDAO<Long, String, Resource> {

    /**
     * remove a resource(includes subordinates) from the resource~tree.
     *
     * @param node resource
     */
    void remove(Resource node);

    /**
     * remove a resource to the resource~tree.
     *
     * @param superior    superior resource
     * @param subordinate subordinate resource
     */
    void add(Resource superior, Resource subordinate);

    /**
     * remove all of the subordinates from the resource node.
     *
     * @param node resource
     */
    void clearSubordinates(Resource node);

    /**
     * move the resource node(includes subordinates) to the target superior.
     *
     * @param node           resource node
     * @param targetSuperior target superior node
     */
    void moveNode(Resource node, Resource targetSuperior);

    /**
     * move the resource's subordinates(excludes this resource node) to the target superior.
     *
     * @param node           resource node
     * @param targetSuperior target superior node
     */
    void moveSubordinates(Resource node, Resource targetSuperior);
}
