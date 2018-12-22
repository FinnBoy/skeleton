package net.awaken.auth.server.entity.resource;

import net.awaken.core.entity.Entity;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public class ResourceTypeAction extends Entity<Long> {

    private ResourceType type;

    private String operation;

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
