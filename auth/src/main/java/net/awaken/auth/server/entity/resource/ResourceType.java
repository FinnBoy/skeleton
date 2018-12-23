package net.awaken.auth.server.entity.resource;

import net.awaken.core.entity.VersionEntity;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public class ResourceType extends VersionEntity<Long> {

    private String name;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
