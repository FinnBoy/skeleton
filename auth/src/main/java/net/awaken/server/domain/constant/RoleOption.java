package net.awaken.server.domain.constant;

/**
 *
 */
public enum RoleOption implements Suitable {
    /**
     * 容器角色
     */
    Container(1),
    /**
     * 作业角色
     */
    Assignment(2);

    private Integer state;

    private RoleOption(Integer state) {
        this.state = state;
    }

    public boolean match(Integer state) {
        return state != null && this.state.intValue() == state.intValue();
    }
}
