package net.awaken.auth.server.entity.resource;

import net.awaken.core.entity.Entity;

/**
 * 资源信息（描述类某个资源的信息，同时被配置的资源意味着受权限管控）
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public class Resource extends Entity<Long> {

    private String identifier;

    private String name;

    private ResourceType type;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }
}
