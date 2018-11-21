package net.awaken.auth.infrastructure;

/**
 * 权限选项
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public enum ResourceAction implements Suitable {
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

    private ResourceAction(int state) {
        this.state = state;
    }

    @Override
    public boolean match(Integer state) {
        return state != null && (this.state & state) == this.state.intValue();
    }

    @Override
    public Integer state() {
        return state;
    }
}
