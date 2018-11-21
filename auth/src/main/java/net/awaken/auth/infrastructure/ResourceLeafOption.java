package net.awaken.auth.infrastructure;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public enum ResourceLeafOption implements Suitable {
    /**
     * Client App Component.
     * eg.:
     * Page, Button.
     */
    Component(10),
    /**
     * Server Service.
     * ps:
     * Document Upload & Download can be also as a kind of service.
     * login as well.
     */
    Service(20),
    /**
     * DB Data.
     */
    Data(30);

    private Integer state;

    private ResourceLeafOption(Integer state) {
        this.state = state;
    }

    @Override
    public boolean match(Integer state) {
        return state != null && this.state.intValue() == state.intValue();
    }

    @Override
    public Integer state() {
        return state;
    }
}
