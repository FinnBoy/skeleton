package net.awaken.auth.server.helper;

import net.awaken.core.bean.CascadeBase;

import java.util.Set;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public class ResourceInfo extends CascadeBase<ResourceInfo, String> {

    public ResourceInfo(Set<ResourceInfo> subordinates) {
        super(subordinates);
    }

    public ResourceInfo(ResourceInfo superior, Set<ResourceInfo> subordinates) {
        super(superior, subordinates);
    }

    public ResourceInfo(Set<ResourceInfo> multiSuperiors, Set<ResourceInfo> subordinates) {
        super(multiSuperiors, subordinates);
    }
}
