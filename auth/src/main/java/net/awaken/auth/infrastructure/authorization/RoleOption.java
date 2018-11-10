package net.awaken.auth.infrastructure.authorization;

import net.awaken.auth.Suitable;

/**
 * 角色选项
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public enum RoleOption implements Suitable {
    /**
     * 容器角色
     */
    Container(10),
    /**
     * 作业角色
     */
    Assignment(20);

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
