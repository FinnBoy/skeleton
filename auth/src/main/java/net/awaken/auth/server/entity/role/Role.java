package net.awaken.auth.server.entity.role;

import net.awaken.auth.server.entity.resource.ResourcePermission;
import net.awaken.core.infrastructure.entity.EntityWithEntryPair;

import java.util.List;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public class Role extends EntityWithEntryPair<String, String> {

    /**
     * role type: Dispatcher or Executor.
     */
    private Integer type;

    private Integer quota;

    private Boolean locked;

    private String lockedReason;

    private List<ResourcePermission> permissions;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getLockedReason() {
        return lockedReason;
    }

    public void setLockedReason(String lockedReason) {
        this.lockedReason = lockedReason;
    }

    public List<ResourcePermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<ResourcePermission> permissions) {
        this.permissions = permissions;
    }
}
