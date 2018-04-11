package net.awaken.server.domain.entity.permission;

import net.awaken.server.domain.entity.resource.Module;
import net.awaken.server.domain.entity.subject.Subject;

import java.util.Set;

/**
 * 角色
 * <p>
 * every role contains permissions,which may be cross module or aggregation.
 */
public interface Role {

    /**
     * grant role to subject.
     *
     * @param subject
     */
    void grant(Subject subject);

    /**
     * revoke role from subject.
     *
     * @param subject
     */
    void revoke(Subject subject);

    /**
     * get related module's privilege.
     *
     * @param module
     * @return privilege
     */
    Privilege getPrivilege(Module module);

    /**
     * get privileges concerned.
     *
     * @return privileges
     */
    Set<Privilege> getPrivileges();

    /**
     * 权限
     *
     * @return permissions
     */
    Set<Permission> getPermissions();

    /**
     * 依赖的角色（拥有当前角色的前提：必须先行拥有依赖角色）
     * <p>禁止互相依赖造成死循环</p>
     *
     * @return dependencies
     */
    Set<Role> getDependencies();

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
     * 互斥角色
     *
     * @return repulsion
     */
    Set<Role> getRepulsion();

    /**
     * 角色可被分配的配额
     *
     * @return quota
     */
    Integer getQuota();
}
