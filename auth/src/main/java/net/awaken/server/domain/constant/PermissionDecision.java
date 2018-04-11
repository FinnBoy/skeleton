package net.awaken.server.domain.constant;

/**
 * 授权决定
 */
public enum PermissionDecision implements Suitable {
    /**
     *
     */
    Deny(0),
    /**
     *
     */
    Authorize(1);

    private Integer state;

    private PermissionDecision(Integer state) {
        this.state = state;
    }

    public boolean match(Integer state) {
        return state != null && this.state.intValue() == state.intValue();
    }
}
