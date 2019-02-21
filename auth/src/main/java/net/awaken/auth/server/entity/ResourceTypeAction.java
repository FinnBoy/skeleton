package net.awaken.auth.server.entity;

import net.awaken.core.infrastructure.entity.EntityWithEntryPair;

/**
 * 资源类型的可授权操作
 *
 * @author Finn Zhao
 * @version 1.0
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
