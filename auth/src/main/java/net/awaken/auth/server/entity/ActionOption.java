package net.awaken.auth.server.entity;

import net.awaken.auth.infrastructure.Suitable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public enum ActionOption implements Suitable {
    /**
     * 登录
     */
    LOGIN(1),
    /**
     * 资源查看
     */
    RESOURCE_VIEW(2),
    /**
     * 容器资源调整
     */
    CONTAINER_RESOURCE_ADJUST(3),
    /**
     * 叶子资源授权：将叶子资源分配给角色
     */
    LEAF_RESOURCE_ALLOCATION(4),
    /**
     * 角色创建
     */
    ROLE_CREATION(5),
    /**
     * 角色授权：将角色权限授权给主体
     */
    ROLE_AUTHORIZATION(6);

    private Integer state;

    private ActionOption(Integer state) {
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
