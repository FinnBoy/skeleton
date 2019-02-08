package net.awaken.auth.server.entity.resource;

import net.awaken.core.infrastructure.entity.EntityWithAction;

/**
 * 权限
 * <p>只设置正向授权，反向禁权可以通过client逻辑来提高用户体验。</p>
 * <p>many to many: role - resource</p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public class ResourcePermission extends EntityWithAction<Long> {

    private Resource resource;

    private ResourceTypeAction action;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public ResourceTypeAction getAction() {
        return action;
    }

    public void setAction(ResourceTypeAction action) {
        this.action = action;
    }
}
