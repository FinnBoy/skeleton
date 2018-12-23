package net.awaken.auth.server.helper;

import net.awaken.core.bean.CascadeExtendBase;

import java.util.Set;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
class ResourceBean extends CascadeExtendBase<ResourceBean, String> {

    public ResourceBean(Set<ResourceBean> subordinates) {
        super(subordinates);
    }

    public ResourceBean(ResourceBean superior, Set<ResourceBean> subordinates) {
        super(superior, subordinates);
    }

    public ResourceBean(Set<ResourceBean> multiSuperiors, Set<ResourceBean> subordinates) {
        super(multiSuperiors, subordinates);
    }
}
