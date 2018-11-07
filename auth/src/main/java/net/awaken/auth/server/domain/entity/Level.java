package net.awaken.auth.server.domain.entity;

/**
 * level.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Level extends AuthEntity<Long> {

    /**
     * get grade.
     *
     * @return grade
     */
    Integer getGrade();

}
