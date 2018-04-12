package net.awaken.server.domain.constant;

/**
 *
 */
public enum RoleScale implements Suitable {
    /**
     *
     */
    Module(1),
    /**
     *
     */
    Aggregation(2),
    /**
     *
     */
    Platform(4);

    private Integer state;

    private RoleScale(Integer state) {
        this.state = state;
    }

    public boolean match(Integer state) {
        return state != null && this.state.intValue() == state.intValue();
    }
}
