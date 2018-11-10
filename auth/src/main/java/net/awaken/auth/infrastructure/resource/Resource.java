package net.awaken.auth.infrastructure.resource;

import net.awaken.auth.Node;

/**
 * 资源信息（描述类某个资源的信息，同时被配置的资源意味着受权限管控）
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Resource extends Node<String, Resource> {

    /**
     * @return leaf type
     * @see LeafOption
     */
    Integer leafState();

}
