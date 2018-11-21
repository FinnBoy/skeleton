package net.awaken.auth.infrastructure;

/**
 * 权限
 * <p>只设置正向授权，反向禁权可以通过client逻辑来提高用户体验。</p>
 * <p>many to many: role - resource</p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface ResourcePermission {

    /**
     * @return actions
     * @see ResourceAction
     */
    Integer getActions();

    /**
     * get resource.
     *
     * @return resource
     */
    Resource getResource();
}
