package net.awaken.server.domain.constant;

/**
 *
 */
public enum SubjectOption implements Suitable {
    /**
     *
     */
    Department(1),
    /**
     *
     */
    Group(2),
    /**
     *
     */
    Principal(4);

    private Integer state;

    private SubjectOption(Integer state) {
        this.state = state;
    }

    public boolean match(Integer state) {
        return state != null && this.state.intValue() == state.intValue();
    }
}
