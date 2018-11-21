package net.awaken.auth.infrastructure;

/**
 * 资源信息（描述类某个资源的信息，同时被配置的资源意味着受权限管控）
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Resource extends TreeNode<String, Resource> {

    /**
     * @return leaf type
     * @see ResourceLeafOption
     */
    Integer leafState();

    /**
     * @return workable actions
     * @see ResourceAction
     */
    int workableActions();
}
