package net.awaken.server.domain.constant;

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
    Read(2),
    /**
     *
     */
    Insert(4),
    /**
     *
     */
    Update(8),
    /**
     *
     */
    Delete(16);

    private Integer state;

    private PermissionAction(int state) {
        this.state = state;
    }

    public boolean match(Integer state) {
        return state != null && (this.state & state) == this.state.intValue();
    }
}
