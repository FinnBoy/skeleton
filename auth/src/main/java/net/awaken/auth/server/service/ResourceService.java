package net.awaken.auth.server.service;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public interface ResourceService {

    /**
     * create a resource.
     *
     * @param resource resource
     */
    void create(ResourceCriteria resource);

    /**
     * delete a resource which has not been in resource~tree yet.
     *
     * @param resource resource
     */
    void delete(ResourceCriteria resource);

    /**
     * remove a resource(includes subordinates) from the resource~tree.
     *
     * @param node resource
     */
    void remove(ResourceCriteria node);

    /**
     * remove a resource to the resource~tree.
     *
     * @param superior    superior resource
     * @param subordinate subordinate resource
     */
    void add(ResourceCriteria superior, ResourceCriteria subordinate);

    /**
     * remove all of the subordinates from the resource node.
     *
     * @param node resource
     */
    void clearSubordinates(ResourceCriteria node);

    /**
     * move the resource node(includes subordinates) to the target superior.
     *
     * @param node           resource node
     * @param targetSuperior target superior node
     */
    void moveNode(ResourceCriteria node, ResourceCriteria targetSuperior);

    /**
     * move the resource's subordinates(excludes this resource node) to the target superior.
     *
     * @param node           resource node
     * @param targetSuperior target superior node
     */
    void moveSubordinates(ResourceCriteria node, ResourceCriteria targetSuperior);
}
