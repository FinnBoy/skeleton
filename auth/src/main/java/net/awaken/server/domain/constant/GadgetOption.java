package net.awaken.server.domain.constant;

public enum GadgetOption implements Suitable {
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
     */
    Service(20),
    /**
     * DB Data.
     */
    Data(30);

    private Integer state;

    private GadgetOption(Integer state) {
        this.state = state;
    }

    public boolean match(Integer state) {
        return state != null && this.state.intValue() == state.intValue();
    }
}
