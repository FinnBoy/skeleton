package net.awaken.auth.server.service;

import net.awaken.core.pojo.VersionIdCriteria;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public class ResourceCriteria extends VersionIdCriteria<String> {

    private String name;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
