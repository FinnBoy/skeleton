package net.awaken.auth.server.dto;

import net.awaken.core.CascadeBase;

import java.util.Set;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public class ResourceInfo extends CascadeBase<ResourceInfo, String> {

    public ResourceInfo(ResourceInfo superior, Set<ResourceInfo> subordinates) {
        super(superior, subordinates);
    }

    public ResourceInfo(Set<ResourceInfo> multiSuperiors, Set<ResourceInfo> subordinates) {
        super(multiSuperiors, subordinates);
    }
}
