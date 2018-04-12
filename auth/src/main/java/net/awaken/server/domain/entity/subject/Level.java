package net.awaken.server.domain.entity.subject;

import net.awaken.server.domain.entity.permission.Role;

/**
 * 每个 level 都有一个 role，而且是 container role.
 */
public interface Level {

    /**
     * get subject option.
     *
     * @return subject option
     */
    Integer getSubjectOption();

    /**
     * get grade.
     *
     * @return grade
     */
    Integer getGrade();

    /**
     * get role by level.
     *
     * @return role
     */
    Role getRole();

    /**
     * get roleQuota.
     *
     * @return roleQuota
     */
    Integer getRoleQuota();

}
