package net.awaken.core.linq.constant;

/**
 * Join Mode: <tt>left join</tt> or <tt>right join</tt> or <tt>inner join</tt>.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018(1.5)
 */
public enum JoinMode {
    left(1),
    right(-1),
    inner(0);

    private int mode;

    JoinMode(int mode) {
        this.mode = mode;
    }

    public int val() {
        return this.mode;
    }

    public boolean isSame(JoinMode mode) {
        return this.mode == mode.val();
    }
}
