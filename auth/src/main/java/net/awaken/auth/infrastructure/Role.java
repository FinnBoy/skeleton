package net.awaken.auth.infrastructure;

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
public interface Role extends TreeNode<String, Role> {

    /**
     * get 角色类型
     *
     * @return mode
     * @see RoleOption
     */
    Integer getState();

    /**
     * grant the permission of resource.
     *
     * @param resource resource
     * @param action   permission action
     */
    void grant(String resource, Integer action);

    /**
     * grant the permission of resource.
     *
     * @param resource resource
     * @param action   permission action
     */
    void revoke(String resource, Integer action);

    /**
     * check whether has the permission of resource.
     *
     * @param resource resource
     * @param action   permission action
     */
    boolean hasPermission(String resource, Integer action);

    /**
     * @param resource resource
     * @param action   action
     * @see Resource
     * @see ResourceAction
     * @see this#grant(String, Integer)
     */
    void grant(Resource resource, ResourceAction action);

    /**
     * @param resource resource
     * @param action   action
     * @see Resource
     * @see ResourceAction
     * @see this#revoke(String, Integer)
     */
    void revoke(Resource resource, ResourceAction action);

    /**
     * @param resource resource
     * @param action   action
     * @return true if exists.
     * @see Resource
     * @see ResourceAction
     * @see this#hasPermission(String, Integer)
     */
    boolean hasPermission(Resource resource, ResourceAction action);

    /**
     * @param permission permission
     * @return true if exists.
     * @see ResourcePermission
     * @see this#hasPermission(String, Integer)
     */
    boolean hasPermission(ResourcePermission permission);

    /**
     * 包含的角色
     * only {@link RoleOption#Dispatcher} role is qualified to contain inclusions.
     *
     * @return inclusions
     */
    Set<Role> getInclusions();

    /**
     * 被当前角色继承的祖先角色
     * only {@link RoleOption#Executor} role is qualified to inherit ancestor's permissions.
     * the inheritor still can add permissions.
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
     * <p>quota(the value of allocated limit)</p>
     *
     * @return quota
     */
    Integer getQuota();

    /**
     * lock this role.
     *
     * @param reason lock reason
     */
    void lock(String reason);

    /**
     * whether locked or not.
     *
     * @return locked
     */
    Boolean isLocked();

    /**
     * get the locked reason when the account is locked.
     *
     * @return locked reason
     */
    String getLockedReason();

}
