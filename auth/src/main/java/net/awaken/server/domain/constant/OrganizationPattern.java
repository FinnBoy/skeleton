package net.awaken.server.domain.constant;

public enum OrganizationPattern implements Suitable {
    /**
     *
     */
    Company(1),
    /**
     *
     */
    Soho(2);

    private Integer state;

    private OrganizationPattern(Integer state) {
        this.state = state;
    }

    public boolean match(Integer state) {
        return state != null && this.state.intValue() == state.intValue();
    }
}
