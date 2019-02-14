package net.awaken.auth.server.entity.role;

import net.awaken.auth.infrastructure.Suitable;

/**
 * 管理员角色选项
 *
 * @author Finn Zhao
 * @version 1.0
 * @see RoleOption
 * @since 11.05.2018
 */
public enum AdminRoleOption implements Suitable {
    /**
     * 超级管理员：<br>
     * 1、可授权：任意（除本权限外）管理员角色权限给某个主体<br>
     * 2、拥有：任意管理员角色权限<br>
     * 3、可将指定的容器资源分配给{@link AdminRoleOption#RESOURCE_ADJUSTMENT}人员<br>
     */
    SUPER_ADMIN(1),
    /**
     * 标准角色的定义与创建，以及角色之间的关系配置
     * <p>
     * 可将指定的标准角色（授权/撤回）分配给<br>
     * 1. {@link AdminRoleOption#PERMISSION_ALLOCATION}<br>
     * 2. {@link AdminRoleOption#SUBJECT_AUTHORIZATION}<br>
     * 人员使用<br>
     * </p>
     */
    ROLE_CREATION(2),
    /**
     * 容器资源的重新调整（新的资源树状结构）
     * <p>
     * 可将指定的容器资源（授权/撤回）分配给{@link AdminRoleOption#PERMISSION_ALLOCATION}人员使用<br>
     * </p>
     */
    RESOURCE_ADJUSTMENT(4),
    /**
     * 角色的叶子资源权限分配
     */
    PERMISSION_ALLOCATION(8),
    /**
     * 主体的角色授权
     */
    SUBJECT_AUTHORIZATION(16);

    private Integer state;

    private AdminRoleOption(Integer state) {
        this.state = state;
    }

    @Override
    public boolean match(Integer state) {
        return state != null && this.state.intValue() == state.intValue();
    }

    @Override
    public Integer state() {
        return state;
    }
}
