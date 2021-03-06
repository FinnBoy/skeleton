package net.awaken.server.domain.entity.subject;

import net.awaken.server.domain.entity.AuthEntity;
import net.awaken.server.domain.entity.permission.Role;

/**
 * 每个 level 都有一个 role，而且是 container role.
 */
public interface Level extends AuthEntity<Long> {

    /**
     * get subject option.
     *
     * @return subject option
     * @see net.awaken.server.domain.constant.SubjectOption
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
