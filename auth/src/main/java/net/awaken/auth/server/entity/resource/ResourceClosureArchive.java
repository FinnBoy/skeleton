package net.awaken.auth.server.entity.resource;

import net.awaken.core.infrastructure.entity.EntityWithClosure;

/**
 * 资源树状结构，存档
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public class ResourceClosureArchive extends EntityWithClosure<Resource> {

    private String archiveCode;

    public String getArchiveCode() {
        return archiveCode;
    }

    public void setArchiveCode(String archiveCode) {
        this.archiveCode = archiveCode;
    }

}
