package net.awaken.core.infrastructure.network;

import java.util.Collection;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 2019.02.01
 */
public class Message<T extends Response> {

    private int state;

    private Collection<Object> descriptions;

    private T response;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Collection<Object> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Collection<Object> descriptions) {
        this.descriptions = descriptions;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

}
