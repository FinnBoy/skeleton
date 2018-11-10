package net.awaken.auth.infrastructure.resource;

import net.awaken.auth.Suitable;

public enum LeafOption implements Suitable {
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

    private LeafOption(Integer state) {
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
