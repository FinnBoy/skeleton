package net.awaken.auth.server.entity.resource;

import net.awaken.core.infrastructure.entity.EntityWithEntryPair;

/**
 * 资源信息（描述类某个资源的信息，同时被配置的资源意味着受权限管控）
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public class Resource extends EntityWithEntryPair<String, String> {

    private ResourceType type;

    /**
     * 报废标记
     */
    private Boolean scrappedFlag;

    public Boolean getScrappedFlag() {
        return scrappedFlag;
    }

    public void setScrappedFlag(Boolean scrappedFlag) {
        this.scrappedFlag = scrappedFlag;
    }

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

}
