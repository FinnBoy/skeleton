package net.awaken.auth.server.domain.constant;

/**
 * 权限选项
 */
public enum PermissionAction implements Suitable {
    /**
     *
     */
    Execute(1),
    /**
     *
     */
    ReadParts(2),
    /**
     *
     */
    Read(4),
    /**
     *
     */
    Insert(8),
    /**
     *
     */
    UpdateParts(16),
    /**
     *
     */
    Update(32),
    /**
     *
     */
    Delete(64);

    private Integer state;

    private PermissionAction(int state) {
        this.state = state;
    }

    public boolean match(Integer state) {
        return state != null && (this.state & state) == this.state.intValue();
    }
}
