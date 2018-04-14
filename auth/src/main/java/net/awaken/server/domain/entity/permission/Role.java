package net.awaken.server.domain.entity.permission;

import net.awaken.server.domain.entity.AuthEntity;

import java.util.Set;

/**
 * 角色
 * <p>
 * every role contains permissions,which may be cross module or aggregation.
 */
public interface Role extends AuthEntity<Long> {

    /**
     * 权限
     *
     * @return permissions
     */
    Set<Permission> getPermissions();

    /**
     * 包含的角色
     *
     * @return inclusions
     */
    Set<Role> getInclusions();

    /**
     * 被当前角色继承的祖先角色
     *
     * @return ancestor
     */
    Role getAncestor();

    /**
     * 依赖的角色（拥有当前角色的前提：必须先行拥有依赖角色）
     * <p>禁止互相依赖造成死循环</p>
     *
     * @return dependencies
     */
    Set<Role> getDependencies();

    /**
     * 互斥角色
     *
     * @return repulsion
     */
    Set<Role> getRepulsions();

    /**
     * 角色可被分配的配额
     *
     * @return quota
     */
    Integer getQuota();

    /**
     * can grant permission to someone.
     *
     * @return
     */
    Boolean isGrantor();

    /**
     * whether locked or not.
     *
     * @return locked
     */
    Boolean isLocked();

    /**
     * get 角色类型
     *
     * @return mode
     * @see net.awaken.server.domain.constant.RoleOption
     */
    Integer getOption();
}
