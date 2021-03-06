package net.awaken.auth.server.entity.role;

import net.awaken.auth.infrastructure.Suitable;

/**
 * 角色选项
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public enum RoleOption implements Suitable {
    /**
     * 管理员角色
     */
    ADMIN(100),
    /**
     * 标准角色
     */
    NORMAL(200);

    private Integer state;

    private RoleOption(Integer state) {
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
