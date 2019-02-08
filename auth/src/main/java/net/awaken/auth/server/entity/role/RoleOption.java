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
     * 分发角色
     */
    Dispatcher(10),
    /**
     * 执行角色
     */
    Executor(20),
    /**
     * 执行角色-容器
     */
    Container(21),
    /**
     * 执行角色-原子
     */
    Atomic(22);

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
