package net.awaken.auth.server.domain.entity;

import net.awaken.auth.server.domain.constant.RoleOption;

import java.util.Set;

/**
 * 角色
 * <p>
 * every role contains permissions,which may be cross module or aggregation.
 * </p>
 * <p>
 * group(组织)所拥有的权限，可以变相理解为group对应的role所拥有的权限，说到底还是role去掌握所有权。
 * </p>
 * <p>principal 与 role 之间是直接关系，
 * 但是 principal 所关联的 group、level 会影响到 role 的所有权
 * （即：当 principal 所在的 group 发生变化时、或者 level 浮动时，principal 所拥有的 role 也需要自动调整）。
 * 所以保持 group、level 这些实体与 role 之间间接关系
 * </p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
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
     * @see RoleOption
     */
    Integer getOption();
}
