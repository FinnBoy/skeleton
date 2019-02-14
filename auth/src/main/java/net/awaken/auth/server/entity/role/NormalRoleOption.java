package net.awaken.auth.server.entity.role;

import net.awaken.auth.infrastructure.Suitable;

/**
 * 角色选项
 *
 * @author Finn Zhao
 * @version 1.0
 * @see RoleOption
 * @since 11.05.2018
 */
public enum NormalRoleOption implements Suitable {
    /**
     * 容器角色
     */
    Container(210),
    /**
     * 原子角色
     */
    Atomic(220);

    private Integer state;

    private NormalRoleOption(Integer state) {
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
