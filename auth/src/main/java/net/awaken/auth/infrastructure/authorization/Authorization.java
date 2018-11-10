package net.awaken.auth.infrastructure.authorization;

import net.awaken.auth.infrastructure.Privilege;
import net.awaken.auth.infrastructure.Subject;

import java.util.Date;

/**
 * （主体）拥有的（角色）许可/授权
 * <p>many to many: role - subject's privilege</p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Authorization extends Privilege {

    /**
     * get role.
     *
     * @return role
     */
    Role getRole();

    /**
     * the container which consists of authorization.
     *
     * @return container
     */
    Privilege getContainer();

    /**
     * get superior grantor.
     *
     * @return superior grantor
     */
    Subject superior();

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
     * @return
     */
    Boolean isDelegatee();

    /**
     * get 失效期
     *
     * @return expiry date
     */
    Date getExpiryDate();

}
