package net.awaken.core.defaults;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class UnsolvedResult extends HandlerResultBase {

    private UnsolvedResult() {
        this.gotoStatus(S_UNSOLVED);
    }

    public static final UnsolvedResult INSTANCE = new UnsolvedResult();

    @Override
    public boolean wrapped() {
        return false;
    }
}
