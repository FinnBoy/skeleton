package net.awaken.auth.server.entity.role;

import net.awaken.auth.server.entity.permission.Permission;
import net.awaken.core.infrastructure.entity.EntityWithEntryPair;

import java.util.List;

/**
 * <p>Dispatcher role:</p>
 * <p>
 * 1. Super-Admin<br>
 * 该角色拥有权限如下：<br>
 * - view & slice all of ContainerResource/查看并调整（切分/合并）所有资源容器<br>
 * - create & configure Dispatcher role/创建并配置（Resource-Configuration）分发角色<br>
 * - dispatch ContainerResources to Dispatcher role/将指定的资源容器分发给各个（Resource-Configuration）分发角色<br>
 * - grant Resource-Configuration role to subject/将某个用户设置为（Resource-Configuration）分发角色<br>
 * 但不具有资源的业务操作权限<br>
 * 该角色同时具有授予/撤回 Resource Configuration 角色的权限<br>
 * <br>
 * 2. Resource-Configuration/资源配置的角色权限<br>
 * 该角色具有权限如下：<br>
 * - view & slice ContainerResource/查看并调整（切分/合并）被授权的资源容器<br>
 * - create & configure Executor role/创建并配置执行角色<br>
 * - dispatch LeafResources to Executor role/将被授权的资源容器下的叶子资源分发给各个执行角色<br>
 * - create & configure Dispatcher role/创建并配置（Role-Authorization）分发角色<br>
 * - dispatch Executor role to Dispatcher role/将 各个执行角色 分发给 各个（Role-Authorization）分发角色<br>
 * 能访问或配置 多少个 或 多大范围的资源容器，由 SuperAdmin 分配。
 * <br>
 * 3. Role-Authorization/资源配置的角色权限<br>
 * 该角色具有权限如下：<br>
 * - view Executor role/查看可用于分配的执行角色<br>
 * - grant Executor role to subject/将某个用户设置为执行角色<br>
 * </p>
 * <p>
 * Dispatcher 角色与 Executor 角色互斥，不能同时拥有（可选、根据业务需求、非必须）。
 * </p>
 * <p>
 * Executor 角色又分为 原子角色（atomic） 和 容器角色（container），一个容器角色可以包含多个原子角色
 * </p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public class Role extends EntityWithEntryPair<String, String> {

    /**
     * role type: Dispatcher（角色分发） or Executor（业务执行）.
     *
     * @see RoleOption
     */
    private Integer type;

    private Integer quota;

    private Boolean locked;

    private String lockedReason;

    private List<Permission> permissions;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getLockedReason() {
        return lockedReason;
    }

    public void setLockedReason(String lockedReason) {
        this.lockedReason = lockedReason;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
