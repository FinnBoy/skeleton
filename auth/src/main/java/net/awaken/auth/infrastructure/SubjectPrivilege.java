package net.awaken.auth.infrastructure;

import java.util.Date;

/**
 * （主体）特权
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface SubjectPrivilege {

    /**
     * get role.
     *
     * @return role
     */
    Role getRole();

    /**
     * get subject.
     *
     * @return subject
     */
    Subject getSubject();

    /**
     * get grantor.
     *
     * @return grantor
     */
    Subject grantor();

    /**
     * can grant permission to someone.
     * <p>
     * 标记为 grantor 的角色，意味着拥有该角色的主体，不仅可以使用该角色的所有权限，还可以将该角色的所有权限 授予 给其他人
     * </p>
     *
     * @return
     */
    Boolean hasGrantorOption();

    /**
     * 是否为 被委托方.
     *
     * @return true if is a temporary mandatary.
     */
    Boolean isMandatary();

    /**
     * get 失效期
     *
     * @return expiry date
     */
    Date getExpiryDate();

}
