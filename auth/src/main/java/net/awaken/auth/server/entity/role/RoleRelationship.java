package net.awaken.auth.server.entity.role;

import net.awaken.core.infrastructure.entity.EntityWithAction;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public class RoleRelationship extends EntityWithAction<Long> {

    /**
     * 主语
     */
    private Role subject;

    /**
     * 谓语：inherit、dependOn、repel、contain
     */
    private Integer predicate;

    /**
     * 宾语
     */
    private Role object;

    public Role getSubject() {
        return subject;
    }

    public void setSubject(Role subject) {
        this.subject = subject;
    }

    public Integer getPredicate() {
        return predicate;
    }

    public void setPredicate(Integer predicate) {
        this.predicate = predicate;
    }

    public Role getObject() {
        return object;
    }

    public void setObject(Role object) {
        this.object = object;
    }
}
