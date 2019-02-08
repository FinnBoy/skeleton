package net.awaken.auth.server.entity.resource;

import net.awaken.core.infrastructure.entity.EntityWithEntryPair;

/**
 * @author Finn Zhao
 * @version 1.0
 * @see ContainerResourceAction
 * @see LeafResourceAction
 * @since 11.05.2018
 */
public class ResourceTypeAction extends EntityWithEntryPair<String, String> {

    private ResourceType type;

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

}
